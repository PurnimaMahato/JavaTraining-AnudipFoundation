//Q.1)WAP to create Queue of list of country and show the difference of remove() and poll() method
package com.queue.example;
//importing LinkedList and queue class
import java.util.LinkedList;
import java.util.Queue;

public class CountryQueue {

    public static void main(String[] args) {
        Queue<String> countryQueue = new LinkedList<>();

        // Add countries to the queue
        countryQueue.add("India");
        countryQueue.add("United States");
        countryQueue.add("China");
        countryQueue.add("Japan");

        // Display the contents of the queue
        System.out.println("Queue: " + countryQueue);

        // Remove the first element using remove()
        String removedCountry = countryQueue.remove();
        System.out.println("Country removed using remove(): " + removedCountry);
        System.out.println("Queue after remove(): " + countryQueue);

        // Remove the first element using poll()
        removedCountry = countryQueue.poll();
        System.out.println("Country removed using poll(): " + removedCountry);
        System.out.println("Queue after poll(): " + countryQueue);

        // Try removing an element from an empty queue using remove()
        removedCountry = countryQueue.remove();
        System.out.println("Country removed using remove() again: " + removedCountry);
        System.out.println("Queue after remove() again: " + countryQueue);

        // Try removing an element from an empty queue using poll()
        removedCountry = countryQueue.poll();
        System.out.println("Country removed using poll() again: " + removedCountry);
        System.out.println("Queue after poll() again: " + countryQueue);

    }
}
