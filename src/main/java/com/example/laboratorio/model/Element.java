package com.example.laboratorio.model;

public class Element {
    private String name;
    private String amount;
    private String material;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Element(String name, String amount, String material, Double price) {
        this.name = name;
        this.amount = amount;
        this.material = material;
        this.price = price;
    }
}
