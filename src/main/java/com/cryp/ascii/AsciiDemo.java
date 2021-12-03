package com.cryp.ascii;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: AsciiDemo
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions: ascii码
 *
 * - History:
 * Date        Author          Modification
 * 2021/11/17   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class AsciiDemo {
    public static void main(String[] args) {
//        char a = 'A';
//        int b = a;
//        System.out.println(b);
        String a = "AaZ";
        // 获取ascii码，需要把字符串转成字符
        char[] chars = a.toCharArray();
        for (char c : chars) {

            int asciiCode = c;
            System.out.println(asciiCode);
        }
    }
}
