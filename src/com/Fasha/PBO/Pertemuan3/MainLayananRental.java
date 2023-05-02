package com.Fasha.PBO.Pertemuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLayananRental {
    public static void main(String[] args) {
        ArrayList<LayananRental> daftarRental = new ArrayList<>();
        daftarRental.add(new LayananRental("Paket Silver", "Bebas milih Mobil mulai dari 1000 CC - 1500 CC dengan waktu Sehari  ", 350000));
        daftarRental.add(new LayananRental("Paket Gold", "Bebas milih mobil mulai dari 1500 CC - 2000 CC dengan waktu Seminggu ",2000000 ));
        daftarRental.add(new LayananRental("Paket Platinum", "Bebas milih Mobil mulai dari 2000 CC - 3500 CC dengan waktu Sebulan", 7000000));

        System.out.println("Daftar Paket Layanan:");
        for (int i = 0; i < daftarRental.size(); i++) {
            System.out.println((i + 1) + ". " + daftarRental.get(i).getNamaPaket() + " (Benefit: " + daftarRental.get(i).getBenefit() + ", Harga: " + daftarRental.get(i).getHarga() + ")");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan nomor paket yang ingin diambil (pisahkan dengan spasi): ");
        String inputPaket = input.nextLine();

        String[] nomorPaket = inputPaket.split(" ");
        int totalHarga = 0;
        for (int i = 0; i < nomorPaket.length; i++) {
            int indexPaket = Integer.parseInt(nomorPaket[i]) - 1;
            if (indexPaket >= 0 && indexPaket < daftarRental.size()) {
                totalHarga += daftarRental.get(indexPaket).getHarga();
            }
        }

        System.out.println("\nTotal harga paket yang diambil: " + totalHarga);
    }
}
