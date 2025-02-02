package com.Pawan.OOPS.Lecture3.Inheritance.SingleIherit;

public class Box {
    int length;
    int width;
    int height;

    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

//    use this constructor if you want a box all the dimensions same
    Box(int dimension){
        this.length = dimension;
        this.width = dimension;
        this.height = dimension;
    }

    public void message(){
        System.out.println("this message is from Box class ");
    }
}
