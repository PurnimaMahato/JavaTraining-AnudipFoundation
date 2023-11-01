//Q.1)WAP to create LinkedList of fruits and apply any five methods of LinkedList.
package com.example;
import java.util.LinkedList;

public class FruitList {
    public static void main(String[] args) {
        // Create a LinkedList of fruits
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Strawberry");

        System.out.println("LinkedList of Fruits: " + fruits);
        //applying any five methods of LinkedList
        // 1. Adding an element to the beginning of the LinkedList
        fruits.addFirst("Orange");
        System.out.println("After adding 'Orange' at the beginning: " + fruits);

        // 2. Adding an element to the end of the LinkedList
        fruits.addLast("Grapes");
        System.out.println("After adding 'Grapes' at the end: " + fruits);

        // 3. Removing the first element from the LinkedList
        fruits.removeFirst();
        System.out.println("After removing the first element: " + fruits);

        // 4. Removing the last element from the LinkedList
        fruits.removeLast();
        System.out.println("After removing the last element: " + fruits);

        // 5. Getting the size of the LinkedList
        int size = fruits.size();
        System.out.println("Size of the LinkedList: " + size);
    }
}

