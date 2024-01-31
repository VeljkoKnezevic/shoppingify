package com.veljkoknezevic.server.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "list")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(nullable = true)
    //Stores 3 states: Null when the list is saved, true if completed, false if cancelled
    private boolean completed;

    @ManyToMany
    @JoinTable(
            name = "item_list",
            joinColumns = @JoinColumn(name = "listId"),
            inverseJoinColumns = @JoinColumn(name = "itemId")
    )
    List<Item> items;

    public ShoppingList() {
    }

    public ShoppingList(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;

        this.completed = completed;
    }

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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
