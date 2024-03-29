package com.example.controle.controller;

import com.example.controle.modele.EmployeModele;

import java.util.List;

public class ManageAffectation {
    private List<EmployeModele> Employs;
    private EmployeModele Employ;
    private String option;

    public EmployeModele getEmploy() {
        return Employ;
    }

    public void setEmploy(EmployeModele employ) {
        Employ = employ;
    }

    private List<String> projet;

    public List<String> getProjet() {
        return projet;
    }

    public void setProjet(List<String> projet) {
        this.projet = projet;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public List<EmployeModele> getEmploys() {
        return Employs;
    }

    public void setEmploys(List<EmployeModele> employs) {
        Employs = employs;


    }
    public  void Affect(){

    }
}
