package com.example;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<>();
		
		// add elements in LinkedList
		languages.add("java");
		languages.add("Python");
		languages.add("javaScript");
		languages.add("Kotlin");
		System.out.println("LinkedList: " + languages);
		
		// remove elements from index
		String str = languages.remove(1);
		System.out.println("Removed Element: " + str);
		
		System.out.println("Updated LinkedList: " + languages);
		

	}

}
