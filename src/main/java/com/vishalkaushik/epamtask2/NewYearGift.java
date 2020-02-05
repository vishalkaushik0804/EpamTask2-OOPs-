package com.vishalkaushik.epamtask2;

public class NewYearGift {

    public static void main(String[] args) {
        Candy c1 = new Candy("Jelly", "Alpenliebe", 12, 2, 20);
        c1.display();
        Wafer w1 = new Wafer("Waffe", "Cadbury", 20, 5, 50);
        w1.display();
        Barfi b1 = new Barfi("Kaju Katli", 1, 1000, 400);
        b1.display();
        Rasgulla r1 = new Rasgulla("Bengali Rasgulla", 2, 2000, 500);
        r1.display();
    }
}
