package com.example.film.Model;

import org.springframework.data.annotation.Id;

public class Item {
    @Id
    private String id;

    private String name;
    private int quantity;
    private String category;

    public Item(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}
