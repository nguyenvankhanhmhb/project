package vn.titv.demo.demo63.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.titv.demo.demo63.Entity.SinhVien;

import javax.swing.text.html.parser.Entity;

@Repository
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
}
