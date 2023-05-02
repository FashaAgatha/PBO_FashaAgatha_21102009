package com.Fasha.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i=0; i<1; i++){
            System.out.println("Looping...  ("+i+")");
        }
        System.out.println("Looping for selesai!");

        int j=1;
        while (j<=100){
            System.out.println("Looping While... ("+j+")");
            j+=10;
        }
        System.out.println("Looping While selesai!");

        int k = 10;
        do{
            System.out.println("Looping do While... ("+k+")");
            k--;
        }
        while (k>0);
        System.out.println("Looping do While selesai");
    }
}
