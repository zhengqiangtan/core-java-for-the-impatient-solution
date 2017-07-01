package com.blaze.corejava.chapter02;

/**
 * Created by sherlockblaze on 30/06/2017.
 *
 * 实现一个Car类，模拟汽车沿着x轴移动，随着移动消耗燃油。提供一个按照给定英里数驱动汽车的方法
 * 给汽车燃油箱添加给定加仑的方法，以及获取原点到油位的当前距离的方法。在构造函数中指定燃料效率
 * (单位为每加仑多少英里)。Car类应该是不可修改类么？为什么或者为什么不应该。
 */

class Car{
    private int currentLocation;
    private int capaticy;
    private int fuelefficiency;

    public Car(int fuelefficiency){
        this.currentLocation = 0;
        this.fuelefficiency = fuelefficiency;
    }

    public void run(){

    }
}
public class Question9 {
    public static void main(String[] args) {

    }
}
