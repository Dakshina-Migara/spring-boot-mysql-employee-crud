package com.example1.demo.test;

public class A {
    B b;
    //methana referance variable eka dagaththata object ekak assign karagena ne

    public A(B b){
        //constructor ekak hadala B type object eka parameterized karala thiyenawa
        this.b = b;
    }
    public void sing(){
        b.dance();
    }
}
