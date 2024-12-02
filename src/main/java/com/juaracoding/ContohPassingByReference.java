package com.juaracoding;

import java.util.ArrayList;
import java.util.List;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author pirda Pirdaus Ripa Atullah Gopur
Created on 02/12/2024 21:36
@Last Modified 02/12/2024 21:36
Version 1.0
*/
public class ContohPassingByReference {

        public static void main(String[] args) {
            ClassPassing classPassing = new ClassPassing();
            ClassPassing classPassing2 = classPassing;
            System.out.println(classPassing);
            System.out.println(classPassing2);

            classPassing.setH(5);
            System.out.println("Value ClassPassing2 : "+classPassing2.getH());
            classPassing2.setH(15);
            System.out.println("Value ClassPassing : "+classPassing.getH());

            List l = new ArrayList();
            l.add("a");
            l.add("b");
            l.add("c");


            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i));
            }

            l.clear();
            l.add("e");
            l.add("f");
            l.add("g");

            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i));
            }
//        List l2 = new ArrayList();
//
//        l2.add("e");
//        l2.add("f");
//        l2.add("g");
//        for (int i = 0; i < l2.size(); i++) {
//            System.out.println(l2.get(i));
//        }

        }
    }

