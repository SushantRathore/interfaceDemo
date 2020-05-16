package com.company;

public class Main {

    public static void main(String[] args) {
        Pc Acer = ()->
                System.out.println("Ms Word Working.....");

        Acer.MsWord();
    }


        interface Pc {
            void MsWord();
        }
    }