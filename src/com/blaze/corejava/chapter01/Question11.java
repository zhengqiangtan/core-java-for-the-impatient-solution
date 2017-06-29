package com.blaze.corejava.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sherlockblaze on 30/06/2017.
 * 读取一个字符串，输出所有的非ASCII字符，以及它们的Unicode值
 * <p>
 * 中文很6liu
 * 4e2d
 * 6587
 * 5f88
 * 36
 * 6c
 * 69
 * 75
 */
public class Question11 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String readStr = buffer.readLine();
        for (int i = 0; i < readStr.length(); i++)
            System.out.println(Integer.toHexString(readStr.charAt(i)));
    }
}
