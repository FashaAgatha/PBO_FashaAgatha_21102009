package com.Fasha.PBO.Pertemuan4.Unguided;

import java.util.ArrayList;
import java.util.Scanner;


public class Barang {
    protected String nama;
    protected int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
