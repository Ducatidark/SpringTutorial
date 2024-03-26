package com.luv2code.springboot.demo.mycoolapp.rest;

public class MyTestClass implements MyTestInterface{
    @Override
    public void method1() {
        System.out.println("hello");
    }

    @Override
    public int method2() {
        return 0;
    }
}
