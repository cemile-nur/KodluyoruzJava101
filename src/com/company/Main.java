package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5, toplam ;

        Scanner input= new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        armutKilo= input.nextInt();
        System.out.print("Elma Kaç Kilo : ");
        elmaKilo= input.nextInt();
        System.out.print("Domates Kaç Kilo : ");
        domatesKilo= input.nextInt();
        System.out.print("Muz Kaç Kilo : ");
        muzKilo= input.nextInt();
        System.out.print("Patlican Kaç Kilo : ");
        patlicanKilo= input.nextInt();

        toplam= (armutKilo*armut)+(elmaKilo*elma)+(domatesKilo*domates)+(muzKilo*muz)+(patlicanKilo*patlican);
        System.out.print("Toplam Tutar: " + toplam);

    }
}
