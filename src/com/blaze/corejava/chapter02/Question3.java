package com.blaze.corejava.chapter02;

/**
 * Created by sherlockblaze on 30/06/2017.
 *
 * 你曾经写过返回值不为void的修改器方法吗？你曾有过返回值为void的访问器方法吗
 * 举个例子
 */
public class Question3 {
   private String a;
   private String b;

   public String modifyNewA(int i){
      a += i;
      return a;
   }

   //根据访问器方法的定义，在想要访问一个元素的情况下，
   //个人认为不可以通过返回值为空的访问器方法来实现。
   public void getNewB(){

   }
}
