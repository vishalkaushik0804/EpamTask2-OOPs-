package com.vishalkaushik.epamtask2;

public class Sweets extends Gift {

    private int Boxes;

    public int getBoxes() {
        return Boxes;
    }

    public void setBoxes(int Boxes) {
        this.Boxes = Boxes;
    }

    public void display() {
        display1();
        System.out.println("Number of Boxes: " + getBoxes());
        System.out.println("");
    }

    public Sweets(String name, int Boxes, double weight, double price) {
        super(name, weight, price);
        this.Boxes = Boxes;
    }

}
