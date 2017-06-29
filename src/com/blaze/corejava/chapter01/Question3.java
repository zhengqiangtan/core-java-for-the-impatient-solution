package com.blaze.corejava.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sherlockblaze on 30/06/2017.
 * 只用条件操作符，写一个程序，读取三个整数并输出最大的，使用Math.max实现相同的功能
 */
public class Question3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String readStr;
        while ((readStr = buffer.readLine()) != null) {
            String[] strArray = readStr.split(" ");
            int[] intArray = new int[3];
            int i = 0;
            for (String elements : strArray) {
                intArray[i++] = Integer.parseInt(elements);
            }

            if (intArray[0] < intArray[1]) {
                int temp = intArray[1];
                intArray[1] = intArray[0];
                intArray[0] = temp;
            }
            if (intArray[0] < intArray[2]) {
                int temp = intArray[2];
                intArray[2] = intArray[0];
                intArray[0] = temp;
            }
            if (intArray[1] < intArray[2]) {
                int temp = intArray[2];
                intArray[2] = intArray[1];
                intArray[1] = temp;
            }

            System.out.println(intArray[0]);

            System.out.println("Using Math.max gets: \t" + Math.max(Math.max(intArray[0],intArray[1]),intArray[2]));
        }
    }
}
