package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Scanner s = new Scanner(System.in);
        int num = 0;
        while (num!=7)
        {
            System.out.println("\n 1. Додати елемент ");
            System.out.println(" 2. Видалити елемент ");
            System.out.println(" 3. Додати елемент в кінець списку");
            System.out.println(" 4. Знайти елемент по імені");
            System.out.println(" 5. Вивести список");
            System.out.println(" 6. Завдання 2");
            System.out.println(" 7. Вийти ");
            System.out.println("Виберіть завдання:");
            num = s.nextInt();
            switch (num) {
                case 1:
                    list.Add(new Sklad());
                    break;
                case 2:
                    list.Delete();
                    break;
                case 3:
                    list.AddBack(new Sklad());
                    break;
                case 4:
                    list.Search();
                    break;
                case 5:
                    list.Print();
                    break;
                case 6:
                    Task2(s);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Некоректний ввід");
            }
        }
    }
    static void Task2(Scanner s)
    {
        System.out.println("Введіть К:");
        int k = s.nextInt();
        System.out.println("Введіть Е:");
        int e = s.nextInt();
        LinkedList students = new LinkedList();
        students.add("S1");
        students.add("S2");
        students.add("S3");
        students.add("S4");
        students.add("S5");
        LinkedList bill = new LinkedList();
        bill.add("1");
        bill.add("2");
        bill.add("3");
        bill.add("4");
        bill.add("5");
        bill.add("6");
        bill.add("7");
        bill.add("8");
        bill.add("9");
        bill.add("10");
        while (!students.isEmpty())
        {
            int tempk = k;
            int tempe = e;
            if (students.size()<=k)
            {
                k = k % students.size();
            }
            if (bill.size()<=e)
            {
                e = e% bill.size();
            }
            System.out.println("Студент:" + students.get(k) + "отримав білет:" + bill.get(e));
            students.remove(k);
            bill.remove(e);
            k = tempk;
            e = tempe;
        }
    }
}
