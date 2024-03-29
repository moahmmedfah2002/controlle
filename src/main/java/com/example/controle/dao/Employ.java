package com.example.controle.dao;

import com.example.controle.modele.EmployeModele;

import java.util.List;

public interface Employ {
    public void creat(EmployeModele empl);
    public EmployeModele find(int id);
    public List<EmployeModele> findAll();

}
