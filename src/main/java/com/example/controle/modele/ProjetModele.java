package com.example.controle.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="projet")
public class ProjetModele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_projet;
    @Column(name="name")
    private String name;
    @Column(name="budget")
    private double budget;
    @ManyToMany(mappedBy = "projets")
    private List<EmployeModele> employes;

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<EmployeModele> getEmployes() {
        return employes;
    }

    public void setEmployes(List<EmployeModele> employes) {
        this.employes = employes;
    }
}
