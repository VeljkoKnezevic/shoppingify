package com.veljkoknezevic.server.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String note;
    @OneToOne
    @JoinColumn(name = "categoryId")
    private Category category;
    @ManyToMany
    @JoinTable(
            name = "item_list_junction",
            joinColumns = @JoinColumn(name = "itemId"),
            inverseJoinColumns = @JoinColumn(name = "listId")
    )
    Set<List> lists;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
