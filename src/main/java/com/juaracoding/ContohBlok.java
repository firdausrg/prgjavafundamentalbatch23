package com.juaracoding;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 02/12/2024 19:53
@Last Modified 02/12/2024 19:53
Version 1.0
*/
public class ContohBlok {
    public static void main(String[] args) {
//        int intJumlah = Integer.parseInt(args[0]);//65
//        double douJumlah = 10.0;
//        short shoJumlah = 10;
//        byte byteJumlah =10;
//        float floJumlah = 10.0f;
//        char chJumlah = 'A';
//        boolean isValid = false;
//        System.out.println((int)'P');
        //CTRL + /
//        int intX = 5 + 3;//operand
        int intX = ambilData() ;//operand
//        System.out.println("Nilai intX adalah : "+intX);
//        System.out.println(intJumlah);
        System.out.println(intX);
        int intY =intX+4;
        System.out.println(intY);
        System.out.println(intX*3);

        int x = 5;
        x = x + 5;
        System.out.println("Nilai x adalah : "+x);

        int y;
        int z;
        int m;

        // FE
        // BE
        // DB

//        byte byteX = -128;
        double douX = 75.0/8;
        System.out.println("Nilai douX : "+douX);

        char chZ = 'X';
        char chM = 77;
        System.out.println("Nilai chM : "+chM);
        System.out.println("\ta\"");
        System.out.println("\ta\"");
        System.out.println("\\");

        int intW = 256;
        byte byteW = (byte) intW;
        System.out.println("Nilai byteW : "+byteW);
//        ./usr/home
//        C:\\Download
//        WORA -> WRITE ONCE RUN ANYWHERE
        //a"

        System.out.println("Max Long : "+Long.MAX_VALUE);
//        9223372036854775807
//        9223372036854775807
        String s = "9223372036854775820";

        int h = 12;
        int k = h;
        System.out.println("Nilai k : "+k);
        k = 14;
        System.out.println("Nilai h : "+h);
        System.out.println("Nilai h : "+k);
    }

    public static int ambilData(){
        return 5+3*4/2-8;
    }
}
