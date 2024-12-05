package com.juaracoding.string;

import java.util.Scanner;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 05/12/2024 20:18
@Last Modified 05/12/2024 20:18
Version 1.0
*/
public class CobaScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strLanjut = "0";
        while(strLanjut.equals("0")){
            System.out.print("Masukkan Panjang : ");
            int intPanjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            int intLebar = sc.nextInt();
            int intLuasPersegiPanjang = intPanjang * intLebar;
            System.out.println("Luas Persegi Panjang Adalah : "+intLuasPersegiPanjang);
            System.out.print("Apakah Anda Ingin Melanjutkan (Tekan 0 jika Ya): ");
            strLanjut = sc.next();
        }

        double douX = sc.nextDouble();
        float floX = sc.nextFloat();
        short shoX = sc.nextShort();
        byte byteX = sc.nextByte();
        long loX = sc.nextLong();
    }
}
