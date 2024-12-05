package com.juaracoding.exceptionhandling;

import java.util.Scanner;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 05/12/2024 20:10
@Last Modified 05/12/2024 20:10
Version 1.0
*/
public class HandlingException {
    public static void main(String[] args) {
//        System.out.println(1/0);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka 10 s.d 20 : ");
        int intInput = sc.nextInt();
//        System.out.println(intInput);
        if(!(intInput>=10 && intInput<=20)){
            System.out.println("Program Berhenti");
            System.exit(0);
        }

        while (true){
            System.out.println("Program Tetap Berjalan");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
