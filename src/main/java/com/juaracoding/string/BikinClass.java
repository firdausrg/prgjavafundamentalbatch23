package com.juaracoding.string;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 05/12/2024 20:17
@Last Modified 05/12/2024 20:17
Version 1.0
*/
public class BikinClass {
    public static void main(String[] args) {
//        System.out.println(10+3);
        String strX = "1a6s54ed6a874w6351e65a4we6q54eoi1j23oiuj1";
//        Standarisasi jwt
//        kode.content.timestamp
        String strY = "ABC#paulch@gmail.com#"+System.currentTimeMillis();
        System.out.println("Token : "+strY);
//        PWT
//        081354
//        Token : ABC#paulch@gmail.com#1733313725710
//        13:30 - 30 menit -> expired 14:00
//        13:30 - 30 menit -> 19:00
        // 1. Request -> Response(kasih cap)
        // 2. Request -> Proses -> Response

        String strCoba = "OK"+3;
        char [] chArr = strX.toCharArray();
//        Built-In Function
//        System.out.println(strX.length());
//        for (int i = 0; i < chArr.length ; i++) {
//            System.out.println(chArr[i]);
//        }
        System.out.println(strX.substring(0,8));
        System.out.println(strX+"garam");

//        ClassPassing classPassing = new ClassPassing();
        System.out.println("Panjang strX : "+strX.length());
//        System.out.println(classPassing);

        String str1 = "OK";
        String str2 ="OK";
//        String str2 = new String("OK");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str2);
        System.out.println(strCoba);
        String strFirst = "abcde";
        String strSecond = "abcfg";
        System.out.println(strFirst.concat(strSecond));
        System.out.println(strX.charAt(20));

        // membandingkan string
        String strOne = "OK";
        String strTwo = "ok";
//        System.out.println(strOne.equals(strTwo));
//        Paul@gmail.com -> paul@gmail.com
//        System.out.println(strOne.equalsIgnoreCase(strTwo));
        strOne = strOne.toUpperCase();
        strTwo = strTwo.toUpperCase();
        System.out.println(strOne.equals(strTwo));

        String strWelcome = "Welcome";
        System.out.println(strWelcome.substring(2));
        System.out.println(strWelcome.substring(0,3));

        String strToken = "K-001#paulch@gmail.com#1733313725710";
        String strArr [] = strToken.split("#");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        System.out.println((System.currentTimeMillis()-1733313725710L)/60000);

    }
}
