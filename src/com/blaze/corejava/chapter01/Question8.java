package com.blaze.corejava.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sherlockblaze on 30/06/2017.
 * 写个程序，读取一个字符串并输出该字符串的所有非空子字符串
 *
 * afdatafadadaf34
 a
 af
 afd
 afda
 afdat
 afdata
 afdataf
 afdatafa
 afdatafad
 afdatafada
 afdatafadad
 afdatafadada
 afdatafadadaf
 afdatafadadaf3
 afdatafadadaf34

 f
 fd
 fda
 fdat
 fdata
 fdataf
 fdatafa
 fdatafad
 fdatafada
 fdatafadad
 fdatafadada
 fdatafadadaf
 fdatafadadaf3
 fdatafadadaf34

 d
 da
 dat
 data
 dataf
 datafa
 datafad
 datafada
 datafadad
 datafadada
 datafadadaf
 datafadadaf3
 datafadadaf34

 a
 at
 ata
 ataf
 atafa
 atafad
 atafada
 atafadad
 atafadada
 atafadadaf
 atafadadaf3
 atafadadaf34

 t
 ta
 taf
 tafa
 tafad
 tafada
 tafadad
 tafadada
 tafadadaf
 tafadadaf3
 tafadadaf34

 a
 af
 afa
 afad
 afada
 afadad
 afadada
 afadadaf
 afadadaf3
 afadadaf34

 f
 fa
 fad
 fada
 fadad
 fadada
 fadadaf
 fadadaf3
 fadadaf34

 a
 ad
 ada
 adad
 adada
 adadaf
 adadaf3
 adadaf34

 d
 da
 dad
 dada
 dadaf
 dadaf3
 dadaf34

 a
 ad
 ada
 adaf
 adaf3
 adaf34

 d
 da
 daf
 daf3
 daf34

 a
 af
 af3
 af34

 f
 f3
 f34

 3
 34

 4
 */
public class Question8 {
    public static void main(String[] args)throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String readStr = buffer.readLine();
        for(int i = 0;i < readStr.length();i++){
            for(int j = i;j < readStr.length();j++){
                System.out.println(readStr.substring(i,j+1));
            }
            System.out.println();
        }
    }
}
