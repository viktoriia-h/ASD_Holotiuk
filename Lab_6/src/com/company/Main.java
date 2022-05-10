package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static  Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Вміст стеку:");
        for (Object el: stack)
        {
            System.out.println(el);
        }
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Вміст стеку після видалення трьох елементів:");
        int sum = 0;
        for (Object el: stack)
        {
            sum += (int)el;
            System.out.println(el);
        }
        System.out.println("Сума елементів стеку: " + sum);

    }
}