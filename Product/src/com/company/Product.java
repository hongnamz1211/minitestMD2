package com.company;

import java.util.Properties;

public class Product {
    private int id;
    private String name;
    private double price;
    private String type;
    private String moneyType = "USD";

    public Product() {

    }

    public Product(int id, String name, double price, String type, String moneyType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.moneyType = moneyType;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

}
