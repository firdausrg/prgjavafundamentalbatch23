package com.juaracoding;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 02/12/2024 21:36
@Last Modified 02/12/2024 21:36
Version 1.0
*/
public class ContohPassingByValue {
    public static void main(String[] args) {
        int z = 15;
        ubahVariable(z);
        System.out.println(z);
    }

    public static void ubahVariable(int m){
        m = 14;
    }
}
