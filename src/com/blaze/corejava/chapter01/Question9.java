package com.blaze.corejava.chapter01;

/**
 * Created by sherlockblaze on 30/06/2017.
 * 两个字符串s和t，s.equals(t)为真，s == t为假。不使用substring举出例子
 */
public class Question9 {
    public static void main(String[] args){
        String a = new String("sherlock");
        String b = new String("sherlock");

        boolean aBool = a == b;
        boolean bBool = a.equals(b);

        System.out.println(aBool);
        System.out.println(bBool);
    }
}
