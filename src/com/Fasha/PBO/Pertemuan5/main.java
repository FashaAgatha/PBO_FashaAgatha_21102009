package com.Fasha.PBO.Pertemuan5;

public class main {
    public static void main(String[]args){
        //membuat array kosong
        Barang[] keranjang = new Barang[10];

        //membuat array dengan isinya
        Barang[] etalase = {
                new Barang("Indomie", 3000),
                new Barang( "pulpen",  3000),
                new Barang( "pensil", 2500),
                new Barang( "spidol",  5000),
                new Barang("penghapus", 4000)
        };

        //n jumlahjumlah data dalam array
        System.out.println("Jumlah Barang yang ada di etalase : "+etalase.length);

        // n data yang ada didalam array
        System.out.println("Daftar barang yang ada didalam etalase : ");

        //perulangan for each untuk menampilkan data yang ada didalam array
        int i = 1;
        for (Barang b : etalase){
            System.out.println("Barang ke-"+1);
            b.showInfo();
            i++;
        }

        for (int j = 0; j< etalase.length;j++){
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showInfo();
        }
    }
}
