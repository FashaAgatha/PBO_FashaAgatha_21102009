package com.Fasha.PBO.Pertemuan3;

public class Main {
    public static void main(String[] args) {

        //Pembuatan class
        SepedaMotor honda = new SepedaMotor("Honda", "Vario 160", 35000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N Max",  40000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 60000000);

        //untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        //uji coba getter dan setter
        System.out.println("Motor merk" + honda.getMerk() + " dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk" + honda.getMerk() + " dengan tipe (sesudah) : " + honda.getTipe());
    }
}
