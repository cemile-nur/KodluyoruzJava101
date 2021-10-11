import java.util.Scanner;

import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("sayı girin: ");
        n=input.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = n;
        int max = n;

        for (int i : list) {

            if(i>n){
                if(n==max || i<max){
                    max=i;
                }
            }
            if(i<n){
                if(n==min || i>min){
                    min=i;
                }
            }
        }

        String list1 = Arrays.toString(list);
        System.out.println("Dizi : " + list1);
        System.out.println("Girilen sayı: "+ n);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
    }

