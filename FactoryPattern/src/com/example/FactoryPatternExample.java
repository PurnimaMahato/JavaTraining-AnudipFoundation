//Create factory pattern for Basic Calculator Create interface as Calculator inside that create calculate() method
package com.example;
//Interface for the Calculator
interface Calculator {
 double calculate(double num1, double num2);
}

//Concrete implementations of the Calculator interface
class AdditionCalculator implements Calculator {
 @Override
 public double calculate(double num1, double num2) {
     return num1 + num2;
 }
}

class SubtractionCalculator implements Calculator {
 @Override
 public double calculate(double num1, double num2) {
     return num1 - num2;
 }
}

class MultiplicationCalculator implements Calculator {
 @Override
 public double calculate(double num1, double num2) {
     return num1 * num2;
 }
}

class DivisionCalculator implements Calculator {
 @Override
 public double calculate(double num1, double num2) {
     if (num2 == 0) {
         throw new ArithmeticException("Division by zero is not allowed.");
     }
     return num1 / num2;
 }
}

//Factory class to create instances of Calculator
class CalculatorFactory {
 public static Calculator getCalculator(String operation) {
     switch (operation.toLowerCase()) {
         case "add":
             return new AdditionCalculator();
         case "subtract":
             return new SubtractionCalculator();
         case "multiply":
             return new MultiplicationCalculator();
         case "divide":
             return new DivisionCalculator();
         default:
             throw new IllegalArgumentException("Invalid operation: " + operation);
     }
 }
}
//Main Class
public class FactoryPatternExample {
 public static void main(String[] args) {
     // Create the calculator using the factory
     Calculator calculator = CalculatorFactory.getCalculator("add");
     
     // Perform a calculation
     double result = calculator.calculate(10, 5);
     
     System.out.println("Result: " + result);
 }
}
