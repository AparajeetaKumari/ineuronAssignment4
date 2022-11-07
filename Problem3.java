package com.Ineuron.Assignments4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
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
		System.out.println("Without Duplicates::"+Problem3.removeDuplicate(inputData));

	}
	
	public static HashSet<String> removeDuplicate(List<String> inputData) {
		HashSet<String> data = new HashSet<>();
		Iterator<String> iterator = inputData.iterator();
		while(iterator.hasNext()) {
			data.add(iterator.next());
		}
		return data;
		
	}

}
