package com.blaze.corejava.chapter04;

import java.util.Objects;

/**
 * Created by sherlockblaze on 02/07/2017.
 */
public class Question3Points {
    protected double x;
    protected double y;

    public Question3Points(){

    }

    public Question3Points(double x, double y) {
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
