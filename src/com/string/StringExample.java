package com.string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Pankaj";
		
		int len=str.length();
		
		String temp="";
		
		for(int i=len-1;i>=0;i--) {
			
			temp=temp+str.charAt(i);
		}
		
		System.out.println(temp);

	}

}
