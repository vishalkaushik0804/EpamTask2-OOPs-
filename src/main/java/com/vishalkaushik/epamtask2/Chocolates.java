package com.vishalkaushik.epamtask2;

public class Chocolates extends Gift {

    private int number_of_gifts;
    private String brand;

    public Chocolates(String name, String brand, double weight, int number_of_gifts, double price) {
        super(name, weight, price);
        this.number_of_gifts = number_of_gifts;
        this.brand = brand;
    }

    public void display() {
        display1();
        System.out.println("Brand : " + getBrand());
        System.out.println("Number: " + getCount());
        System.out.println("");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getCount() {
        return number_of_gifts;
    }

    public void setCount(int number_of_gifts) {
        this.number_of_gifts = number_of_gifts;
    }

}
