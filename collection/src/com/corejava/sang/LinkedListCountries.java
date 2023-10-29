//Q.2)Create a LinkedList which contains at least 10 countries in list in java .

package com.corejava.sang;
import java.util.LinkedList;

public class LinkedListCountries {

    public static void main(String[] args) {
    	// Creating a linked list
        LinkedList<String> countries = new LinkedList<>();

        // Add countries to the linked list
        countries.add("India");
        countries.add("United States");
        countries.add("China");
        countries.add("United Kingdom");
        countries.add("France");
        countries.add("Germany");
        countries.add("Japan");
        countries.add("Russia");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Australia");

        // displaying the elements of the linked list
        System.out.println("LinkedList of countries:" + countries);
    }
}
