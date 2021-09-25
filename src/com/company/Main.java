package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int yıl;
        Scanner input =new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yıl= input.nextInt();

        if(yıl % 4==0){
            System.out.print( yıl +" bir artık yıldır ! ");

        }else if((yıl %100==0) && (yıl %400==0)){

            System.out.print( yıl +" bir artık yıldır ! ");

        }else if (yıl == 1700 && yıl==1800 && yıl ==1900){

            System.out.print( yıl +" bir artık yıl değildir ! ");

        }else {
            System.out.print( yıl +" bir artık yıl değildir ! ");
        }









    }
}