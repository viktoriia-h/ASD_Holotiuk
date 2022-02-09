package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Завдання 1");
        System.out.println("Завдання 2");
        System.out.println("Завдання 3");
        int num = s.nextInt();
        switch (num) {
            case 1:
                task1(s);
                break;
            case 2:
                task2(s);
                break;
            case 3:
                task3(s);
                break;
            default:
                System.out.println("Некоректний ввід");
        }
    }

    static void task1(Scanner s) {
        System.out.print("Ведіть внутрішній радіус кільця: ");
        double a = s.nextDouble();
        System.out.print("Ведіть зовнішній радіус кільця: ");
        double b = s.nextDouble();
        double sq = ((Math.PI * Math.pow(b, 2)))-(Math.PI * Math.pow(a, 2));
        System.out.printf("Площа кільця: %f", sq);
    }
    static void task2(Scanner s){
        System.out.print("Ведіть координату х: ");
        double x = s.nextDouble();
        double y = ((Math.sin(x)+Math.cos(x))/(Math.sqrt(5+Math.tan(x))));
        System.out.printf("Координата у: %f", y);
    }
    static void task3(Scanner s){
        System.out.print("Ведіть число: ");
        double a = s.nextDouble();
        if (a>9 && a<100){
            if (a % 2 ==0){
                System.out.printf("Число є парним двозначним");
            }
            else {System.out.printf("Число не є парним двозначним");}
        }
        else {System.out.printf("Число не є парним двозначним");}
    }
}