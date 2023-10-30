//Q.2)WAP to implement Consumer interface using lambda expression
package com.example;
import java.util.function.Consumer;

public class CustomerExample {
    public static void main(String[] args) {
        // Create a Consumer lambda expression to print a greeting
        Consumer<String> greetingConsumer = (name) -> System.out.println("Hello, " + name + "!");

        // Pass the greetingConsumer to the printGreeting() method
        printGreeting("Purnima", greetingConsumer);

        // Create another Consumer lambda expression to convert a string to uppercase
        Consumer<String> toUpperCaseConsumer = (string) -> System.out.println(string.toUpperCase());

        // Pass the toUpperCaseConsumer to the printGreeting() method
        printGreeting("Rahul", toUpperCaseConsumer);
    }

    private static void printGreeting(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }
}

