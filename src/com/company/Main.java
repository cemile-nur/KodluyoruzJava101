package com.company;
import  java.util.Scanner;

public class Main {

        static int besCikar( int n, boolean dNoktasi, int sayac){


            if (dNoktasi) {
                if (n > 0) {
                    System.out.print(n + " ");
                    sayac++;
                    return besCikar(n - 5, true, sayac);
                } else {
                    return besCikar(n, false, sayac);
                }
            } else {
                System.out.print(n + " ");
                if (sayac > 0) {
                    sayac--;
                    return besCikar(n + 5, false, sayac);
                } else {
                    return 0;
                }
            }

        }

        public static void main (String[]args){
            int n;
            Scanner input = new Scanner(System.in);

            System.out.print("N Sayısı : ");
            n = input.nextInt();

            System.out.print("Çıktısı : ");
            besCikar(n, true, 0);

        }
    }







