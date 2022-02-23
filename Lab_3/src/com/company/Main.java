package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Sklad shop[] = input();
         Sklad sortShop[] = sort(shop);
         output(sortShop);
         identify(shop);
    }
    static Sklad[] input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введіть кількість товарів: ");
        int n = s.nextInt();
        Sklad shop[] = new Sklad[n];
        for (int i = 0; i < n; i++) {
            Sklad sklad = new Sklad();
            shop[i] = sklad;
        }
        return shop;
    }
   static void output (Sklad shop[]){
        for (int i = 0; i < shop.length; i++) {
            System.out.println("Назва товару: " +shop[i].name);
            System.out.println("Одиниця виміру товару: " +shop[i].type);
            System.out.println("Кількість товару: " +shop[i].quantity);
            System.out.println("Вартість товару: " +shop[i].cost);
        }
   }
    static Sklad[] sort(Sklad shop[]){
        for (int i=0; i<shop.length; i++){
            for ( int j=i+1; j<shop.length; j++){
                if (shop[j].name.compareTo(shop[i].name)<0){
                    Sklad k = shop[i];
                    shop[i] = shop[j];
                    shop[j] = k;
                }
            }
        }
        return shop;
    }
    static void identify(Sklad shop[]){
        Scanner s = new Scanner(System.in);
        boolean found = false;
        System.out.print("Введіть назву товару: ");
        String l = s.next();
        for (int i=0; i<shop.length; i++){
            if (shop[i].name.equals(l)){
                found = true;
                System.out.println("Назва товару: " +shop[i].name);
                System.out.println("Одиниця виміру товару: " +shop[i].type);
                System.out.println("Кількість товару: " +shop[i].quantity);
                System.out.println("Вартість товару: " +shop[i].cost);
                System.out.print("Загальна вартість товару: " +shop[i].quantity*shop[i].cost +shop[i].type);
                break;
            }
        }
        if (found == false){
            System.out.print("Товару не існує");
            s.next();
        }
    }
}
