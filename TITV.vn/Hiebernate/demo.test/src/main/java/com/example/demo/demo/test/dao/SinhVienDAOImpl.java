package com.example.demo.demo.test.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class SinhVienDAOImpl implements SinhVienDAO{

    private EntityManager entityManager;

    @Autowired
    public SinhVienDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public void save(SinhVien sinhVien) {

    }
}
