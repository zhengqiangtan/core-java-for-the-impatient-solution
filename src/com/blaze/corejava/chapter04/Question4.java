package com.blaze.corejava.chapter04;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by sherlockblaze on 02/07/2017.
 *
 * 定义一个抽象类Shape，包含一个Point类的实例变量，一个构造函数、一个具体方法public
 * void moveBy(double dx,double dy)根据给定数量移动位置，以及一个抽象方法public Point getCenter()。
 * 提供具体的子类Circle、Rectangle、Line，构造函数分别是public Circle(Point center,double radius)、
 * public Rectangle(Point topLeft,double width,double height)及public Line(Point from,Point to)
 */

/**
 * 总感觉这个设计不是很对。。。。
 * */
abstract class Shape{
    private Point[] pointArray;

    public Shape(Point[] pointArray){
        this.pointArray = pointArray;
    }

    public void moveBy(double dx,double dy){
        for(Point elements : pointArray){
            elements.setX(elements.getX() + dx);
            elements.setY(elements.getY() + dy);
        }
    }

    abstract public Point getCenter();
}

class Circle extends Shape implements Cloneable{
    private Point point;
    private double radius;
    private ArrayList<String> arrayList;

    public Circle(Point center,double radius,ArrayList<String> arrayList){
        super(new Point[]{center});
        this.point = center;
        this.radius = radius;
        this.arrayList = arrayList;
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius() {

        return radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    @Override
    public Circle clone(){
        return new Circle(this.point,this.radius,new ArrayList<String>(arrayList));
    }
}

class Rectangle extends Shape{
    private Point topLeft;
    private double height;
    private double width;

    public Rectangle(Point topLeft,double height,double width){
        super(new Point[]{topLeft});
        this.height = height;
        this.width = width;
    }

    @Override
    public Point getCenter() {
        double x = topLeft.getX() + width / 2;
        double y = topLeft.getY() + height / 2;
        return new Point(x,y);
    }
}

class Line extends Shape implements Cloneable{
    private Point from;
    private Point to;
    private ArrayList<String> arrayList;

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    public Line(Point from, Point to,ArrayList<String> arrayList){
        super(new Point[]{from,to});
        this.from = from;
        this.to = to;
        this.arrayList = arrayList;
    }

    @Override
    public Point getCenter() {
        double x = (from.getX() + from.getX()) / 2;
        double y = (from.getY() + from.getY()) / 2;
        return new Point(x,y);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}

public class Question4 {
    public static void main(String[] args) {

    }
}
