package com.Fasha.PBO.Pertemuan4.Unguided;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Minimarket minimarket = new Minimarket();
        Scanner input = new Scanner(System.in);

        int pilihan = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Hitung total pendapatan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama barang: ");
                    String namaBarang = input.next();
                    System.out.print("Harga barang: ");
                    int hargaBarang = input.nextInt();
                    Barang barang = new Barang(namaBarang, hargaBarang);
                    minimarket.tambahBarang(barang);
                    break;
                case 2:
                    minimarket.hitungTotalPendapatan();
                    break;
                case 3:
                    System.out.println("Terima kasih telah Berbelanja:)");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 3);
    }
}