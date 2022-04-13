package com.company;
import  java.util.Scanner;

public class Sklad {
    String name;
    String type;
    int quantity;
    double cost;
    Scanner s = new Scanner(System.in);

    Sklad(){
        System.out.print("Введіть назву товару: ");
        String name=s.next();
        System.out.print("Введіть одинцю виміру товару: ");
        String type=s.next();
        System.out.print("Введіть кількість одиниць товару: ");
        int quantity=s.nextInt();
        System.out.print("Введіть ціну товару: ");
        double cost=s.nextDouble();
        this.name=name;
        this.type=type;
        this.quantity=quantity;
        this.cost=cost;
    }
}
