package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1;
        Scanner hesapla = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi1 = hesapla.nextInt();

        for(int i=0; i<= sayi1; i+=2){
            System.out.print(i + ",");
        }

        System.out.print(" ******************");

        int sayi,i,sayac=0,toplami=0,ortalama=0;
        Scanner inp= new Scanner(System.in);

        System.out.print(" Sayı girin");
        sayi= inp.nextInt();

        for ( i=0; i<=sayi; i++){

            if((i % 3==0) || (i % 4==0)){

                toplami+=i;
                sayac++;
            }
        }

        ortalama=toplami/sayac;
        System.out.print("ortalama= "+ortalama);

    }
}