//Q.1)Create a Tree Set for storing even numbers.
 
package com.corejava.sang;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEvenNumbers {

    public static void main(String[] args) {
    	//Creating a TreeSet 
        Set<Integer> evenNumbers = new TreeSet<>();

        // Add even numbers to the set
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);

        //Displaying the elements in the evenNumbers
        System.out.println("Tree set of even numbers:" + evenNumbers);
   }
}
