package com.sause;

import org.testng.annotations.Test;

public class Baseclass {
	
	
	
	public static void main(String[] args){
	String input="helloworldkmk34343mkdsmfkdmf";
	
	String number =input.replaceAll("[A-Za-z]", "");
	System.out.println(number);
	}

}
