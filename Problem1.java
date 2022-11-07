package com.Ineuron.Assignments4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Problem1 {
	
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
		
		System.out.println("List is::"+inputData);
		System.out.println("Reverse List is::"+Problem1.reverse(inputData));
		
		
	}
	
	public static List<String> reverse(List<String> input){
		Collections.reverse(input);
		return input;
		
	}

}
