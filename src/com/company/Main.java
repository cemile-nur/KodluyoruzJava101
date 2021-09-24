package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double avarage = (mat+fizik+kimya+turkce+muzik)/5;

        if(avarage>0 && avarage<55){
            System.out.print("Not Ortalamanız: "+avarage+" Kaldınız !");
        }else if (avarage>=55 && avarage<=100){
            System.out.print("Not Ortalamanız: "+avarage+" Tebrikler Geçtiniz !");
        }else {
            System.out.print("Girdiğiniz Notları Kontrol ediniz!" );
        }

    }
}