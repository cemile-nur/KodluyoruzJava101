package com.company;
import  java.util.Scanner;

public class Main {


    static void asal(){
        Scanner scan= new Scanner(System.in);
        int sayi, kontrol=0;

        System.out.print("sayı girin: ");
         sayi = scan.nextInt();

        for (int i = 2; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                kontrol = 1;
                break;
            }
        }
        if(kontrol==0)
        {
            System.out.println(sayi +  "Asaldır. ");

        }else {
            System.out.println(sayi +  "Asal Değildir! ");
        }
       
    }

    public static void main(String[] args) {

        asal();
    }
}






