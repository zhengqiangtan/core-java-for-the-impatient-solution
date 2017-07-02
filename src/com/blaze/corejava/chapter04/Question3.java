package com.blaze.corejava.chapter04;

import java.util.Objects;

/**
 * Created by sherlockblaze on 02/07/2017.
 *
 * 将Question1中的实例变量x，实例变量y修改成protected。演示一下LabeledPoint类只能在
 * LabeledPoint实例中访问这些变量。
 *
 * 分析详情请移步helpchapter04.HelpQuestion3
 */
class Question3Point{
    protected double x;
    protected double y;

    public Question3Point(){

    }

    public Question3Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        return this + "\tx=\t" + x + "\ty=\t" + y;
    }

    @Override
    public boolean equals(Object otherObj){
        if(this == otherObj)
            return true;
        if(! (otherObj instanceof Point))
            return false;
        Question3Point newOtherObj = (Question3Point)otherObj;
        if(Objects.equals(this.x,newOtherObj.x) && Objects.equals(this.y,newOtherObj.y))
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }
}

class Question3LabeledPoint extends Question3Point{
    private String label;

    public Question3LabeledPoint(){
    }

    /**
     * 子类构造方法必须在第一行调用父类构造方法，如果父类中没有声明无参构造方法，则需要显示调用
     * */
    public Question3LabeledPoint(String label,double x,double y) {
//        LabeledPoint();
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

public class Question3 {
}
