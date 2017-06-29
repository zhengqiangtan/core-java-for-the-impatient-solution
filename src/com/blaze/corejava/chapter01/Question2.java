package com.blaze.corejava.chapter01;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * Created by sherlockblaze on 29/06/2017.
 * 写个程序：读取整数，然后经过运算转换成0'～359'之间的值。首先用%操作符完成，然后再试floorMod
 */
class MathFloor implements Serializable {
    private int x;
    private int y;
    private int afterModFunc;

    MathFloor() {
    }

    public int getAfterModFunc() {
        return afterModFunc;
    }

    public void setAfterModFunc(int afterModFunc) {
        this.afterModFunc = afterModFunc;
    }

    public MathFloor(int x, int y) {
        this.x = x;
        this.y = y;
        afterModFunc = floorMod();
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int floorDiv() {
        int r = x / y;
        System.out.println("first round r : " + r);
        System.out.println("x's binary" + Integer.toBinaryString(x));
        System.out.println("y's binary" + Integer.toBinaryString(y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("x ^ y's binary" + Integer.toBinaryString(x ^ y));
        System.out.println("r * y = x ?" + (r * y) + " " + x);
        //当x、y是两个符号不同的数时，而且模数不为0时，则向下-1。
        if ((x ^ y) < 0 && (r * y) != x) {
            r--;
        }
        return r;
    }

    private int floorMod() {
        //余数通过 x - floorDiv * y的值来获得
        int r = x - floorDiv() * y;
        return r;
    }
}

public class Question2 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String readStr;
        int readInt;
        while ((readStr = buffer.readLine()) != null) {
            readInt = Integer.parseInt(readStr);
            System.out.println("Simple Method gets:\t" + readInt % 359);
            //对于floorMod来说，始终会得到正数
            System.out.println("floorMod gets\t" + new MathFloor(readInt, 359).getAfterModFunc());
        }

    }
}
