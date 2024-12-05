package com.juaracoding.exceptionhandling;

import java.sql.SQLException;
import java.util.Scanner;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 05/12/2024 20:11
@Last Modified 05/12/2024 20:11
Version 1.0
*/
public class NewHandling {
    public static void main(String[] args) {
//        System.out.println(1/0);
        try{
            System.out.println("Masuk dulu kesini");
            //        ClassPassing classPassing = null;
            //        System.out.println(classPassing.getH());
//                System.out.println(1/0);
            //        Thread.sleep(1000);
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Angka : ");
            int input = sc.nextInt();
            //        System.out.println(input);
        }catch(Exception e){
            System.out.println("Masuk Kesini Illegal Argument Error nya adalah : "+e.getMessage());
        }finally {
            System.out.println("INi akan di eksekusi");
            //tutup koneksi nya disini
        }
//        System.out.println(Integer.parseInt("100"));
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        C:\\download\\data\\123.jpeg

//        int intArr [] = {1,2,3,4};
//        System.out.println(intArr[5]);
        Scanner scn = new Scanner(System.in);
        int intX = scn.nextInt();
        if(intX>10){
            throw new IllegalArgumentException("Harus Lebih dari 10");
        }else {
            System.out.println("DONE !!");
        }
        System.out.println("Hue");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    public static void callData()throws SQLException {
        System.out.println("Masuk sini !!");
    }
}
