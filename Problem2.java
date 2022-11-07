package com.Ineuron.Assignments4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
	public static void main(String args[]) {
		System.out.println("Enter the length List");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		System.out.println("Enter vaules to List of String");
		List<String> inputData = new ArrayList<>();
		
		while(len>0) {
			inputData.add(sc.next());
			len --;
		}
		
		System.out.println("enter the String to match with");
		String matcher = sc.next();
		
		System.out.println("List is::"+inputData);
		System.out.println("List of string of which will have only values which starts with git"+listConatins(inputData, matcher));
		
		
		
	}
	
	public static List<String> listConatins(List<String> inputData, String matchWith){
		List<String> outputData = new ArrayList<>();
		Iterator< String> iterator = inputData.iterator();
		while(iterator.hasNext()) {
			String val = iterator.next();
			if(val.contains("Git")||val.equalsIgnoreCase("Git")) {
				outputData.add(val);
			}
		}
		return outputData;
	}

}
