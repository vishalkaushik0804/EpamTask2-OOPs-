package com.vishalkaushik.epamtask2;

public abstract class Gift {

    public String name;
    public double weight;
    public double price;

    public Gift(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void display1() {
        System.out.println("Name of the Gift: " + getName());
        System.out.println("Weight: " + getWeight() + " Grams");
        System.out.println("Price: " + getPrice() + " Rupees");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
