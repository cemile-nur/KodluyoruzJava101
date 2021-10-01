package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi,toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        for(int i=1; i<sayi; i++){

            if(sayi % i ==0){
                toplam+=i;
            }

        }if(toplam==sayi){
            System.out.print(  "Mükemmel Bir Sayıdır" );
        }else

        System.out.print( "Mükemmel bir Sayı Değildir");

    }

}