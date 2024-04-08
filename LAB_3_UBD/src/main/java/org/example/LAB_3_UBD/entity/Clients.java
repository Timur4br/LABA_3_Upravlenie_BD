package org.example.LAB_3_UBD.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Clients")
@NamedQuery(name = "Clients.getAll", query = "SELECT c from Clients c")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client", nullable = false)
    private Integer id_client;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "id_master")
    private Integer id_master;
    @Column(name = "is_delete")
    private Boolean delete;

    public Clients(Integer id_client, String name, String surname, Integer id_master, Boolean delete) {
        this.id_client = id_client;
        this.name = name;
        this.surname = surname;
        this.id_master = id_master;
        this.delete = delete;
    }
    public Clients() {}
    public Integer getId_client() {
        return id_client;
    }
    public void setId_client(Integer id) {
        this.id_client = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Integer getId_master() {return id_master;}
    public void setId_master(Integer id_master) {this.id_master = id_master;}
    public Boolean getDelete() {
        return delete;
    }
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}