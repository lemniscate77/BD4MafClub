package com.deltrio.bd4mafclub.model.club;


import javax.persistence.*;

@Entity
@Table
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;
}
