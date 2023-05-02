package com.Fasha.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajerkami = new Manajer();
        Pegawai pegawaikami = new Pegawai();

        manajerkami.nip = 21102009;
        manajerkami.nama = "Fasha Agatha";

        pegawaikami.nip = 21102000;
        pegawaikami.nama = "Gaga";

        manajerkami.showInfo();
        manajerkami.extraInfo();
        manajerkami.bonus(1200000);
        manajerkami.bonus();

        pegawaikami.showInfo();
    }
}
