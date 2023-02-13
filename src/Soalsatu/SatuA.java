package Soalsatu;

import java.util.Scanner;

public class SatuA {
    public void methodSatuA(){
        String nama;
        Scanner inputUser;
        inputUser = new Scanner(System.in);


        System.out.println("Masukan nama anda : ");
        nama = inputUser.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi " + nama +"!");
    }
}
