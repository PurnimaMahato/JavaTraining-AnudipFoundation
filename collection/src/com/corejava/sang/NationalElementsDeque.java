//Q.1)WAP to create deque of National elements(anthem,bird,sport etc) and perform at least 7 operations on that.
package com.corejava.sang;
import java.util.*;

public class NationalElementsDeque {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a dequeue to store national elements
      Deque<String> nationalElementsDeque = new LinkedList<>();

      // Add national elements to the dequeue using addLast() and addFirst() methods
      nationalElementsDeque.addLast("National Anthem: Jana Gana Mana");
      nationalElementsDeque.addLast("National Bird: Peacock");
      nationalElementsDeque.addFirst("National Sport: Hockey");
      nationalElementsDeque.addFirst("National Animal: Tiger");

      // Display the deque
      System.out.println("National Elements of Deque are: " + nationalElementsDeque);

      // Get the first and last elements using getFirst() and getLast() methods
      String firstElement = nationalElementsDeque.getFirst();
      String lastElement = nationalElementsDeque.getLast();
      System.out.println("First Element: " + firstElement);
      System.out.println("Last Element: " + lastElement);

      // Remove the first element using removeFirst()
      String removedElement = nationalElementsDeque.removeFirst();
      System.out.println("Removed Element: " + removedElement);

      // Display the updated deque
      System.out.println("Updated National Elements Deque: " + nationalElementsDeque);

      // Peek the first element using peekFirst() 
      String peekedElement = nationalElementsDeque.peekFirst();
      System.out.println("Peeked Element: " + peekedElement);

      // Remove the last element using removeLast()
      String removedLastElement = nationalElementsDeque.removeLast();
      System.out.println("Removed Last Element: " + removedLastElement);

      // Display the final deque
      System.out.println("Final National Elements Deque: " + nationalElementsDeque);
	}

}