package com.blaze.corejava.chapter02;

/**
 * Created by sherlockblaze on 30/06/2017.
 * <p>
 * 给前面两个版本的PointS类添加javadoc注释
 */

/**
 * 实现一个描述平面上点的不可修改的Point类
 * @author SherlockBlaze
 * @Version 1.1
 * */
class PointS {
    /**
     * 点的x轴坐标值
     * */
    private double x;
    /**
     * 点的y轴坐标值
     * */
    private double y;

    /**
     * 默认设置点的位置为(0.0,0.0)
     * @Constructor
     * */
    public PointS() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * 创建坐标为(x,y)的点
     * @Constructor
     * @param x:x轴坐标 y:y轴坐标
     * */
    public PointS(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 返回调用对象的x轴坐标
     * @return double x轴坐标值
     * */
    public double getX() {
        return x;
    }

    /**
     * 返回调用对象的y轴坐标
     * @return double y轴坐标
     * */
    public double getY() {
        return y;
    }

    /**
     * 返回一个新的Point，通过调用Point对象的x、y坐标分别对应加上传入的x、y值得到新Point的坐标值
     * @param x 调用Point对象需要调动的x轴坐标差量
     * @param y 调用Point对象需要调动的y轴坐标差量
     * @return Point 新的Point对象，不修改调用Point对象坐标
     * */
    public PointS translate(double x, double y) {
        return new PointS(this.x + x, this.y + y);
    }

    /**
     * 返回一个新的Point，通过调用Point对象的x、y坐标分别乘以某一个数新Point的坐标值
     * @param div
     * @return Point 新的Point对象，不修改调用Point对象坐标
     * */
    public PointS scale(double div) {
        return new PointS(x * div, y * div);
    }
}

/**
 * 实现一个描述平面上点的不可修改的Point类
 * @author SherlockBlaze
 * @Version 1.2
 * */
class PointSTwoDemo {
    /**
     * Point x轴坐标值
     * */
    private double x;
    /**
     * Point y轴坐标值
     * */
    private double y;

    /**
     * 默认Point坐标在原点
     * @constructor
     * */
    public PointSTwoDemo() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * 设置Point对象坐标值为x、y
     * @constructor
     * @param x 新建Point对象的x轴坐标值
     * @param y 新家Point对象的y轴坐标值
     * */
    public PointSTwoDemo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 返回调用Point对象的x轴坐标值
     * @constructor
     * */
    public double getX() {
        return x;
    }

    /**
     * 返回调用Point对象的y轴坐标值
     * @constructor
     * */
    public double getY() {
        return y;
    }

    //修改器方法，修改调用此方法对象的属性／值
    /**
     * 修改调用Point对象的坐标值,让x、y轴坐标对应加上传入x、y
     * @param
     *      x 需要增加的x轴坐标差量
     *      y 需要增加的y轴坐标差量
     * @return Point
     * */
    public PointSTwoDemo translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    /**
     * 修改调用Point对象的坐标值,让x、y轴坐标分别乘以传入的div值
     * @param
     *      div 需要用于坐标值相乘的值
     * @return Point
     * */
    public PointSTwoDemo scale(double div) {
        this.x *= div;
        this.y *= div;
        return this;
    }
}

public class Question7 {
    public static void main(String[] args) {

    }
}
