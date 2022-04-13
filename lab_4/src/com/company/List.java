package com.company;

import java.util.Scanner;

public class List {
    Scanner s = new Scanner(System.in);
    private LinkedList head;

    public List() {
        head = null;
    }

    public void Add(Sklad data) {
        LinkedList item = new LinkedList(data);
        item.next = head;
        head = item;
    }
    public void AddBack(Sklad data)
    {
        LinkedList item = head;
        while (item.next != null)
        {
            item = item.next;
        }
        LinkedList backItem = new LinkedList(data);
        item.next = backItem;
        backItem.next = null;
    }

    public void Print() {
        LinkedList item = head;

        while (item != null) {
            System.out.println(item.data.name);
            System.out.println(item.data.type);
            System.out.println(item.data.quantity);
            System.out.println(item.data.cost + "\n");
            item = item.next;
        }
    }

    public void Delete() {
        System.out.print("Введіть назву товару, який хочете видалити: ");
        String name = s.next();
        LinkedList cur = head;
        LinkedList prev = head;

        while (!cur.data.name.equals(name)) {
            if (head == null) {
                return;
            } else {
                prev = cur;
                cur = cur.next;
            }
            if (cur == head)
                head = head.next;
            else
                prev.next = cur.next;
        }
    }
    public void Search(){
        System.out.print("Введіть назву товару, який хочете знайти: ");
        String name = s.next();
        LinkedList item = head;
        while (item != null){
            if (item.data.name.equals(name))
            {
                System.out.println(item.data.name);
                System.out.println(item.data.type);
                System.out.println(item.data.quantity);
                System.out.println(item.data.cost + "\n");
            }
            item = item.next;
        }
        System.out.print("Елемент не знайдено");

    }
}



