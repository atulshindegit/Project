package com.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Atul");
		list.add("Abhi");
		list.add("kartik");
		
		for(String s:list) {
			
			System.out.println(list);
		}
	}
}
