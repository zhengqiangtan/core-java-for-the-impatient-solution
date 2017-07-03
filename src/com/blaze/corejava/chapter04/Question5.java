package com.blaze.corejava.chapter04;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by sherlockblaze on 03/07/2017.
 * <p>
 * 为前面的类添加 clone 方法
 */
public class Question5 {
    public static void main(String[] args) {
        /**
         * 深拷贝
         * */
        Point point = new Point(5.9, 4.3);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sherlock");
        Circle circle = new Circle(point, 4.0,arrayList);
        Circle clone_circle = circle.clone();

        System.out.println(circle.getPoint().getX() + "\t"
                + circle.getPoint().getY() + "\t"
                + circle.getRadius());

        System.out.println(clone_circle.getPoint().getX() + "\t"
                + clone_circle.getPoint().getY() + "\t"
                + clone_circle.getRadius());

        circle.getArrayList().add("blaze");

        /**
         * 针对非 基本类型/不可变量 的克隆就行特别的编写
         * */
        System.out.println("-----Circle------");
        for(String elements : circle.getArrayList())
            System.out.println(elements);

        for(String elements : clone_circle.getArrayList())
            System.out.println(elements);
        System.out.println("-----Circle------");

        System.out.println(clone_circle == circle);
        System.out.println(Objects.equals(circle, clone_circle));

        /**
         * 浅拷贝:Object类中的clone方法无法对非 基本类型/不可变的量进行完全的克隆，克隆对象与被克隆对象共享可变的状态
         * */
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("zj");
        Point pointTo = new Point(8.9, 9.2);
        Line line = new Line(point, pointTo,arrayList1);
        try {
            Line cloneLine = line.clone();
            System.out.println(line.getFrom().getX() + "\t"
                    + line.getFrom().getY() + "\t"
                    + line.getTo().getX() + "\t"
                    + line.getTo().getY() + "\t"
                    + cloneLine.getFrom().getX() + "\t"
                    + cloneLine.getFrom().getY() + "\t"
                    + cloneLine.getTo().getX() + "\t"
                    + cloneLine.getTo().getY());

            line.getArrayList().add("blaze");

            System.out.println("-----Line------");
            for(String elements : line.getArrayList())
                System.out.println(elements);

            for(String elements : cloneLine.getArrayList())
                System.out.println(elements);
            System.out.println("-----Line------");

            System.out.println(line == cloneLine);
            System.out.println(Objects.equals(line,cloneLine));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
