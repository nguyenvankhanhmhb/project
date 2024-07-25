package vn.titv.spring.demo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.titv.spring.demo.entity.SinhVien;

import java.util.List;

@Repository
@Transactional
public class SinhVienDAOImpl implements SinhVienDAO{
    private EntityManager entityManager;

    @Autowired
    public SinhVienDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(SinhVien sinhVien) {
        this.entityManager.persist(sinhVien);
    }

    @Override
    public SinhVien getById(int id) {
        return this.entityManager.find(SinhVien.class, id);
    }

    @Override
    public List<SinhVien> getAll() {
        String jpql = "select s FROM SinhVien s";
        return
                this.entityManager.createQuery(jpql, SinhVien.class).getResultList();
    }

    @Override
    public List<SinhVien> getByTen(String ten) {
        String jpql = "select s FROM SinhVien s WHERE s.ten=:t";
        TypedQuery<SinhVien> query = this.entityManager.createQuery(jpql, SinhVien.class);
        query.setParameter("t", ten );
        return  query.getResultList();
    }
}
