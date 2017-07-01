package com.blaze.corejava.chapter02;

/**
 * Created by sherlockblaze on 30/06/2017.
 * <p>
 * 继续练习5、把translate方法和scale方法修改成修改器方法。
 */
class PointTwo {
    private double x;
    private double y;

    public PointTwo() {
        this.x = 0;
        this.y = 0;
    }

    public PointTwo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //修改器方法，修改调用此方法对象的属性／值
    public PointTwo translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public PointTwo scale(double div) {
        this.x *= div;
        this.y *= div;
        return this;
    }
}

public class Question6 {
    public static void main(String[] args) {
        PointTwo pointTwo = new PointTwo(3,4).translate(1,3).scale(0.5);
        System.out.println("X:\t" +
                pointTwo.getX() + "\tY:\t" + pointTwo.getY());
    }
}
