package Soalsatu;

import java.util.Scanner;

public class Soaldua {
    public void methodSoaldua(){
        Scanner inputUser = new Scanner(System.in);
        int pilih;
        System.out.println("Pilih Rumus");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Volume Balok");
        System.out.println("Masukan Pilihan : ");
        pilih = inputUser.nextInt();

        if(pilih == 1){
            double jari, luasling;
            double phi = 3.14;
            System.out.println("Masukan jari-jari lingkaran : ");
            jari = inputUser.nextDouble();

            luasling = phi*jari*jari;
            System.out.println("Luas Lingkaran dengan jari-jari " +jari+ " adalah " +luasling);
        } else if (pilih == 2) {
            double lebar, panjang, tinggi, volbalok;
            System.out.println("Masukan lebar");
            lebar = inputUser.nextDouble();
            System.out.println("Masukan panjang");
            panjang = inputUser.nextDouble();
            System.out.println("Masukan tinggi");
            tinggi = inputUser.nextDouble();
            volbalok = lebar*panjang*tinggi;
            System.out.println("Volume Balok : " +volbalok);
        }else {
            System.out.println("Maaf pilihan tidak ada :)");
        }

    }
}
