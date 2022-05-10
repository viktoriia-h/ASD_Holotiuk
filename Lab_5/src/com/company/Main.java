package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static  Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Введіть к-сть елементів двохзв'язного списку:");
        int index = 0;
        int size = s.nextInt();
        System.out.println("Введіть елементи двохзв'язного списку:");
        while(index<size){

            linkedList.add(s.nextInt());
            index++;
        }

        System.out.println("Старий список");
        for(Integer el : linkedList){
            System.out.print(el);
            System.out.println();
        }

        for(int i = linkedList.size()-1; i >= 0; i--){
            if(linkedList.get(i) % 2 != 0){
                linkedList.remove(i);
            }
        }
        System.out.println("Новий список");
        for(Integer el : linkedList){
            System.out.print(el);
            System.out.println();
        }

        if (linkedList.isEmpty())
        {
            System.out.println("null");
        }
        else {
            System.out.println("Покажчик на перший елемент");
            System.out.print(linkedList.getFirst());
        }
    }
}