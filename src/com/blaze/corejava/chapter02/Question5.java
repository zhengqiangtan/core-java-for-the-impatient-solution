package com.blaze.corejava.chapter02;

/**
 * Created by sherlockblaze on 30/06/2017.
 *
 * 实现一个描述平面上点的不可修改的Point类。提供一个设置具体点的构造函数，一个设置为原点
 * 的无参构造函数，以及方法getX、getY、translate和scale。translate方法根据给定量在x
 * 和y方向上移动该点。scale方法根据给定因子在坐标系按比例变化。实现这些方法以便它们将新
 * 的Point对象作为结果返回。例如：
 *      Point p = new Point(3,4).translate(1,3).scale(0.5)
 * 得到的p为坐标系上的点(2,3.5)
 */

class Point{
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

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

    public Point translate(double x, double y){
        return new Point(this.x + x,this.y +y);
    }

    public Point scale(double div){
        return new Point(x * div,y * div);
    }
}

public class Question5 {
    public static void main(String[] args){
        Point point = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println("x=" + point.getX() + "y:\t" + point.getY());
    }
}
