//Q.1)WAP to implement Supplier interface using lambda Expression
package com.example;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Using a lambda expression to create a Supplier that supplies a random number
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);

        // Get a random number from the Supplier
        int randomNumber = randomNumberSupplier.get();

        System.out.println("Random Number: " + randomNumber);
    }
}
