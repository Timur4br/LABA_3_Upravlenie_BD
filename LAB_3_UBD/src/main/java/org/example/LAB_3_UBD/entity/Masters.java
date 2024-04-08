package org.example.LAB_3_UBD.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Masters")
@NamedQuery(name = "Masters.getAll", query = "SELECT m from Masters m")
public class Masters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_master")
    private Integer id_master;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name="is_delete")
    private Boolean delete;
    public Masters(Integer id_master, String name, String surname, Boolean delete) {
        this.id_master = id_master;
        this.name = name;
        this.surname = surname;
        this.delete = delete;
    }
    public Masters() {}
    public Integer getId_master() {
        return id_master;
    }
    public void setId_master(Integer id_master){this.id_master = id_master;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getDelete() {
        return delete;
    }
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}
