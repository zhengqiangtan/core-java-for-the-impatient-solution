package com.blaze.corejava.helpchapter04;



import com.blaze.corejava.chapter04.Question3;
import com.blaze.corejava.chapter04.Question3Points;

import java.util.Objects;

/**
 * Created by sherlockblaze on 02/07/2017.
 */

class SonOfPoints extends Question3Points{
    private double fathersum;

    public SonOfPoints(){
        /**在Question3Points子类中，可以访问该类的x、y属性*/
        this.fathersum = x + y;
        Question3Points q3p = new Question3Points();
        /**
         * 除了子类中可以直接访问protected修饰的变量。其他方式无法访问
         * */
        double a = q3p.getX();
    }

    public double getFathersum() {
        return fathersum;
    }
}

public class HelpQuestion3 {
    public static void main(String[] args) {
        SonOfPoints sop = new SonOfPoints();
        sop.getX();
    }
}
