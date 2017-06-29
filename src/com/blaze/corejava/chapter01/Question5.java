package com.blaze.corejava.chapter01;

/**
 * Created by sherlockblaze on 30/06/2017.
 * 当你将一个double类型的值转换为int类型的值，并且该值大于最大可能的int值，可能会发生什么
 */
public class Question5 {
    public static void main(String[] args){
        double a = 34343533645265.13441;
        System.out.println(a);
        int b = (int)a;
        System.out.println(b + "\t\tBinary:\t" + Integer.toBinaryString(b));
        /**
         * 会直接将最大的Int值赋给b*/
    }
}
