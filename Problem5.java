package com.Ineuron.Assignments4;

import java.util.ArrayList;


public class Problem5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(19);
		list2.add(29);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(7);
		list3.add(17);
		list3.add(27);
		
		ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
		finalList.add(list1);
		finalList.add(list2);
		finalList.add(list3);
		
		System.out.println("final List is ::"+finalList);
		

	}

}
