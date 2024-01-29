package com.veljkoknezevic.server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    private int id;

    private String name;
}
