package com.ksr.ifelse;

public class CharacterFinding {
	 public static void main(String[] args) {
		 char ch='&';
	        if(ch >= 'A' && ch <= 'Z')
	        {
	            System.out.println(ch);
	            System.out.println("Uppercase");
	        }
	        else if(ch >= 'a' && ch <= 'z')
	        {
	            System.out.println(ch);
	            System.out.println("Lowercase");
	        }
	        else if(ch >= '0' && ch <= '9')
	        {
	            System.out.println(ch);
	            System.out.println("Number");
	        }
	        else
	             System.out.println(ch);
	             System.out.println("Special character");
	}
}
