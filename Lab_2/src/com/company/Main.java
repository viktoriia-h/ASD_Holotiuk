package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Завдання 1");
        System.out.println("Завдання 2");
        System.out.println("Завдання 3");
        System.out.println("Завдання 4");
        System.out.println("Завдання 5");
        System.out.println("Виберіть завдання:");
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
            case 4:
                task4(s);
                break;
            default:
                System.out.println("Некоректний ввід");
        }

    }

    static void task1(Scanner s) {
        Random rand = new Random();
        System.out.print("Введіть розмір масиву ");
        int a = s.nextInt();
        int sum = 1;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = rand.nextInt(99);
        }
        System.out.print(Arrays.toString(arr));
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                sum = sum * arr[i];
            }
        }
        System.out.println("Добуток елементів масиву з парними ындексами = " + sum);

        int max1 = 0;
        int max2 = 0;
        for (int i = 1; i < a; i++) {
            if (Math.abs(arr[i]) > arr[max1]) {
                max1 = i;
            }
        }
        for (int i = 1; i < a; i++) {
            if (Math.abs(arr[i]) > arr[max2] && Math.abs(arr[i]) < arr[max1]) {
                max2 = i;
            }
        }
        if (max1 > max2) {
        System.out.println("К-сть елементів між двома найбільшими = " + (max1 - max2-1));
        }
        else {
            System.out.println("К-сть елементів між двома найбільшими  = " + (max2 - max1-1));
        }
    }
    static void task2(Scanner s) {
        System.out.print("Введіть розмір масиву ");
        int a = s.nextInt();
        System.out.print("Введіть 1-ий індекс ");
        int b = s.nextInt();
        System.out.print("Введіть 2-ий індекс ");
        int c = s.nextInt();
        Random rand = new Random();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = rand.nextInt(99);
        }
        System.out.print(Arrays.toString(arr));


        int d=c-b;
        for (int i = b+1; i <a-1; i++) {
            arr[i]=arr[c];
            c++;
        }
        for (int i =a-1 ; i > a-d; i--) {
            arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));
        }

    static void task3(Scanner s) {
        System.out.print("Введіть к-сть рядків ");
        int a = s.nextInt();
        System.out.print("Введіть к-сть стовпців ");
        int b = s.nextInt();
        Random rand = new Random();
        int arr[][]=new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
            arr[i][j] = rand.nextInt(5);
            System.out.print(arr[i][j]+"\t");
        }
            System.out.println();}

        int c=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i%2!=0){
                    c+=arr[i][j];
                }
            }System.out.println("" +c);
            c=0;
        }
        int d1=1;
        int d=1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
               d1=d*arr[i][j];
                }
            if(d1>d){
                d=d1;
                d1=1;
            }
        }
        System.out.println("" +d);
    }
    static void task4(Scanner s){
        System.out.print("Введіть к-сть рядків та стовпців");
        int a = s.nextInt();
        Random rand = new Random();
        int arr[][]=new int[a][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i > j && i < a - j - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}