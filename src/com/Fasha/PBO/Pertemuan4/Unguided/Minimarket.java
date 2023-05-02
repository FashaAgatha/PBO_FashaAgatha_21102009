package com.Fasha.PBO.Pertemuan4.Unguided;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimarket {
    protected ArrayList<Barang> daftarBarang = new ArrayList<Barang>();
    protected int totalPendapatan = 0;

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void hitungTotalPendapatan() {
        for (Barang barang : daftarBarang) {
            totalPendapatan += barang.getHarga();
        }
        System.out.println("Total pendapatan minimarket: " + totalPendapatan);
    }
}