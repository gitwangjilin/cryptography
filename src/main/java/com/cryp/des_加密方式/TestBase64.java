package com.cryp.des_加密方式;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: TestBase64
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/11/26   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class TestBase64 {
    public static void main(String[] args) throws Base64DecodingException {
        String str="TU0jV0xBTiNVYys5bEdiUjZlNU45aHJ0bTdDQStBPT0jNjQ2NDY1Njk4IzM5OTkwMDAwMzAwMA==";


        String rlt1=new String(Base64.decode(str));

        String rlt2= Base64.decode(str).toString();

        System.out.println(rlt1);

        System.out.println(rlt2);
    }
}