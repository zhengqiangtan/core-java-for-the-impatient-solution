package com.blaze.corejava.chapter04;

/**
 * Created by sherlockblaze on 02/07/2017.
 *
 * 定义一个Point类，构造函数是public Point(double x,double y)，访问方法有getX、getY
 * 定义一个子类LabeledPoint，构造函数是public LabeledPoint(String label,double x,double y)，访问方法是getLabel
 */

/**
 * 当属性私有化时，子类无法访问，所以没有父类的属性
 * */
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(){
        super(2,3);
    }

    /**
     * 子类构造方法必须在第一行调用父类构造方法，如果父类中没有声明无参构造方法，则需要显示调用
     * */
    public LabeledPoint(String label,double x,double y) {
        super(x,y);
//        LabeledPoint();
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

public class Question1 {
    public static void main(String[] args) {

    }
}
