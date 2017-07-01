package com.blaze.corejava.chapter02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sherlockblaze on 30/06/2017.
 * <p>
 * 改变日历打印程序，让每周从周日开始。同时让它在结尾新打印一行(并且只新打印一行)
 * 我使用了书中所提供的方法
 */
public class Question1 {
    /**
     * LocalDate date = LocalDate.of(year,month,1);
     * date = date.plusDays(1);
     * while(date.getMonthValue() == month){
     * System.out.printf("%4d",date.getDayOfMonth());
     * date = date.plusDays(1);
     * }
     * DayOfWeek weekday = date.getDayOfWeek();
     * int value = weekday.getValue();
     * for(int i = 1;i < value.i ++)
     * System.out.println(" );
     */

    private static LocalDate date = LocalDate.of(2017, 1, 1);
    private static List<String> list = new ArrayList<>(450);

    static {
        list.add("日");
        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        list.add("五");
        list.add("六");
    }

    private static void printList() {
        int index = 0;
        String temp = "";
        boolean nextLine = false;
        for (String element : list) {
//            Pattern pattern = Pattern.compile("[0-9]*");

            if (element.equals(" ") && !temp.equals(" ")) {
                System.out.println();
                index = 0;
            }

            if (element.endsWith("月")){
                System.out.println();
                nextLine = true;
            }

            System.out.print(element + "\t");

            if(nextLine){
                System.out.println();
                nextLine = false;
                index --;
            }



            index++;

            if (Math.floorMod(index, 7) == 0)
                System.out.println();

            temp = element;
        }
    }

    public static void main(String[] args) {
        int dayValue;
        for (int i = 0; i < 12; i++) {
            int currentMonth = date.getMonthValue();
            list.add(currentMonth + "月");
            DayOfWeek weekday = date.getDayOfWeek();
            //判断开头
            for (int j = 0; j < weekday.getValue(); j++)
                list.add(" ");

            while (date.getMonthValue() == currentMonth) {
                dayValue = date.getDayOfMonth();
                //添加当前日期
                list.add(String.valueOf(dayValue));
                date = date.plusDays(1);
            }

        }
        printList();
        System.out.println();
    }
}
