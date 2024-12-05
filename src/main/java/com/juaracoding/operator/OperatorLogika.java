package com.juaracoding.operator;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 05/12/2024 20:15
@Last Modified 05/12/2024 20:15
Version 1.0
*/
public class OperatorLogika {
    public static void main(String[] args) {
        // AND -> &&
        // NAND -> ! &&
        // OR -> ||
        // NOR -> ! ||
        // NOT -> !
        // XOR -> ^
        // XNOR -> ! ^
        //AND OR NOT
        System.out.println("Nilai dari (1>1) : "+(1>1));
        System.out.println("Nilai dari (5==5) : "+(5==5));
        System.out.println((5==5) ^ (1>1));

        // interval 20 s.d 30
//        int intInput = 25;
//        System.out.println(!(intInput>=20 && intInput<=30));
        System.out.println("Bitwise 10 | 12 : "+(10|12));
        System.out.println("Hasil 10>>1 : "+(12>>1));
        System.out.println(((true ^ false) && false || (true ^ true)));


//        String strHuruf = "A";
//        strHuruf.equals("A") ||
//        strHuruf.equals("I") ||
//        strHuruf.equals("U") ||
//        strHuruf.equals("E") ||
//        strHuruf.equals("O")

//        String
    }
}
