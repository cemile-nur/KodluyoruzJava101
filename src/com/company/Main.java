import java.util.Scanner;

import  java.util.Arrays;

public class Main {

    static boolean isFind( int[] arr, int value){

        for (int i : arr){
            if(i==value){
                return  true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        int [] list = { 7,8,9,58,69,33,13,58,88,9,104,88,13};
        int[] even = new int[list.length];
        int startIndex=0;

        for(int i=0; i< list.length; i++){
            for(int j=0; j< list.length; j++){

                if((i != j) && (list[i] == list[j])){
                    if(!isFind(even, list[i])){
                        if( list[i] % 2==0){
                        even[startIndex++]= list[i];
                        }
                    }
                    break;
                }

            }
        }
        for (int value: even){
            if(value != 0){
                System.out.println(value);
            }
        }

    }
 }

