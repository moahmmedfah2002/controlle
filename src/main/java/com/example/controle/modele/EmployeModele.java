package com.example.controle.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employe")
public class EmployeModele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_empl;
    @Column(name = "name")
    private String Name;
    @Column(name = "email")
    private String email;
    @Column(name = "id_skills")
    private int id_skille;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="employ_projet",
    joinColumns = @JoinColumn(name = "id_empl",referencedColumnName="id"),
    inverseJoinColumns = @JoinColumn(name ="id_projet",referencedColumnName="id"))
    private List<ProjetModele> projets;

    public int getId_empl() {
        return id_empl;
    }

    public void setId_empl(int id_empl) {
        this.id_empl = id_empl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_skille() {
        return id_skille;
    }

    public void setId_skille(int id_skille) {
        this.id_skille = id_skille;
    }



    public List<ProjetModele> getProjets() {
        return projets;
    }

    public void setProjets(List<ProjetModele> projets) {
        this.projets = projets;
    }
}
