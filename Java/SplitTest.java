package com.devesh.oops;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is\rdevesh singh\rManu Singh\rPwc\nIIMT";
		
		String[] strArr = str.split("\r?\n", 2);
		
		for(String st : strArr){
			System.out.println(st);
			System.out.println("NextLine");
		}
	}

}
