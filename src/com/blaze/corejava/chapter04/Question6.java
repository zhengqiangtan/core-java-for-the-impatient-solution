package com.blaze.corejava.chapter04;

/**
 * Created by sherlockblaze on 04/07/2017.
 *
 * 假设在4.2.2节，Item.equals方法调用了instanceof检测。实现DiscountedItem.equals方法：
 * 如果otherObject是一个Item对象，则只需要与父类比较；如果otherObject是一个DiscountedItem对象，
 * 则还要比较实例变量discount。证明这个方法有对称性，但没有传递性——也就是说，存在items和discounted items组合，
 * 满足x.equals(y)和y.equals(z)为真，但x.equals(z)不为真
 *
 * 4.2.2节实例见helpchapter04.HelpQuestion6
 */


/**
 *
 * */
public class Question6 {
    public static void main(String[] args) {

    }
}
