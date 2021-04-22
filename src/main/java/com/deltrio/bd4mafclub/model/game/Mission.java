package com.deltrio.bd4mafclub.model.game;

import javax.persistence.*;

@Entity
@Table
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
}
