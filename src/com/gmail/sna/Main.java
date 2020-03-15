package com.gmail.sna;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("White");
		myList.add("Red");
		myList.add("Orange");
		myList.add("Yellow");
		myList.add("Green");
		myList.add("Blue");
		myList.add("Darkblue");
		myList.add("Violet");
		myList.add("Grey");
		myList.add("Black");
		myList.remove(myList.size()-1); 
		myList.remove(myList.size()-1);
		myList.remove(0);
		System.out.println("Rainbow colors are " + myList);
		
	}

}
