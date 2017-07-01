package com.blaze.corejava.chapter02;

/**
 * Created by sherlockblaze on 30/06/2017.
 *
 * 创建一个HelloWorld.java文件，它在包ch01.sec01中声明HelloWorld类。把它
 * 放在某个目录，但不在ch01/sec01子目录。从存放文件的那个目录运行javac HelloWorld.java
 * 你会得到类文件么？类文件存放在哪里。接着运行java HellWorld，会发生什么。为什么javac -d .
 * HelloWorld.java 更好。
 */
public class Question12 {
    /**
     * 如果不放在包名所对应的目录中，java程序可以通过编译，但是没有办法运行
     * 会提示找不到主类，通过javac -d . 类名 方式来编译java代码，可以将编译
     * 后的字节码文件放到特定的文件夹中。这样，java就可以找到正确的主类并且运行。
     * */
}
