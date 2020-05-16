package com.company;

public class Main {

    public static void main(String[] args) {
      // creating instance of interface using lambda expression
        Pc Acer = ()->
                System.out.println("Ms Word Working.....");

// calling method of interface
        Acer.MsWord();
    }


        interface Pc {
            void MsWord();
        }
    }