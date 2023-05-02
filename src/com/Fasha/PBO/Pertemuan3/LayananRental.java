package com.Fasha.PBO.Pertemuan3;

public class LayananRental {
    private String namaRental;
    private String benefit;
    private int harga;

    public LayananRental(String namaRental, String benefit, int harga) {
        this.namaRental = namaRental;
        this.benefit = benefit;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaRental;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaRental = namaPaket;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

