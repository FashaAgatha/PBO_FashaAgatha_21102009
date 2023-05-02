package com.Fasha.PBO.Pertemuan2;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        String correctUsername = "Fasha";
        String correctPassword = "123";

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login berhasil silakan masuk");
        } else if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        } else {
            System.out.println("Username dan password Anda salah");
        }

        input.close();
    }
}





