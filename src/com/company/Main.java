package com.company;


import java.io.*;
import java.lang.reflect.Method;
import java.util.Properties;


public class Main {

    public static void main(String[] args) throws  Exception {

        Class c = Class.forName("com.company.Test");
        Test t = (Test)c.newInstance();

        Method m = c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        m.invoke(t,null);
    }}
