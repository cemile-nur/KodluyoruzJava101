import java.util.Scanner;

import  java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n= in.nextInt();
        int[] list = new int[n];


        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i=0 ; i<n; i++){

        System.out.print( (i+1) + " . Elemanı: ");

        int size= in.nextInt();
          list [i] = size;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
 }

