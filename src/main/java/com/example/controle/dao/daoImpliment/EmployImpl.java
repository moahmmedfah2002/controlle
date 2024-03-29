package com.example.controle.dao.daoImpliment;

import com.example.controle.dao.Employ;
import com.example.controle.modele.EmployeModele;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class EmployImpl implements Employ {
    private EntityManager entityManager= Persistence.createEntityManagerFactory("controlle").createEntityManager();

    @Override
    public void creat(EmployeModele empl) {
        entityManager.getTransaction().begin();
        entityManager.persist(empl);
        entityManager.getTransaction().commit();
    }

    @Override
    public EmployeModele find(int id) {
        EmployeModele empl=entityManager.find(EmployeModele.class,id);
        return empl;

    }

    @Override
    public List<EmployeModele> findAll() {
        return null;
    }
}
