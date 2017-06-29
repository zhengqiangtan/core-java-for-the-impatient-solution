package com.blaze.corejava.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sherlockblaze on 29/06/2017.
 * 写个程序，它读取一个整数并以二进制、八进制和十六进制输出。以十六进制输出倒数。
 */
public class Question1 {
    public static void main(String[] args)throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String readStr;
        while((readStr = buffer.readLine()) != null){
            int readInt = Integer.parseInt(readStr);
            System.out.println(Integer.toBinaryString(readInt));
            System.out.printf("%o\n",readInt);
            System.out.printf("%x\n",readInt);

            double reciprocal = 1.0 / readInt;
            System.out.println(reciprocal);
            System.out.printf("%a\n",reciprocal);
        }
    }
}
