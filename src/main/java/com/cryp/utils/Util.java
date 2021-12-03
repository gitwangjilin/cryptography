package com.cryp.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: KaiserDemo
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions: 文件转string  string 转文件
 *
 * - History:
 * Date        Author          Modification
 * 2021/11/17   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class Util {
	
	public static void print(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			sb.append(bytes[i]).append(" ");
		}
		System.out.println(sb);
	}
	
	public static String file2String(String path) throws IOException {
		FileReader reader = new FileReader(new File(path));
		char[] buffer = new char[1024];
		int len = -1;
		StringBuffer sb = new StringBuffer();
		while ((len = reader.read(buffer)) != -1) {
			sb.append(buffer, 0, len);
		}
		return sb.toString();
	}
	
	public static void string2File(String data, String path){
		FileWriter writer = null;
		try {
			writer = new FileWriter(new File(path));
			writer.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public static String inputStream2String(InputStream in) throws IOException {
		int len = -1;
		byte[] buffer = new byte[1024];
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while((len = in.read(buffer)) != -1) {
			baos.write(buffer, 0, len);
		}
		baos.close();
		
		return baos.toString("UTF-8");
	}
	
	
}
