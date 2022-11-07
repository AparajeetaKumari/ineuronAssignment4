package com.Ineuron.Assignments4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println("Enter the length List");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		System.out.println("Enter vaules to List of String");
		List<Integer> inputData = new ArrayList<Integer>();
		
		while(len>0) {
			inputData.add(sc.nextInt());
			len --;
		}

		System.out.println("List is::"+inputData);
		System.out.println(" print the second element, second last element::"+Problem4.get(inputData, 1, inputData.size()));
	}
	
	public static List<Integer> get(List<Integer> inputData,int index1, int index2) {
		List<Integer> outputData =  new ArrayList<Integer>();
		for(int i=0;i<inputData.size();i++) {
			System.out.println("Index is::"+i);
			if((i==index1) || (i==index2)) {
				outputData.add(inputData.get(i));
			}
		}
		return outputData;
	}
	
	
	
	

}
