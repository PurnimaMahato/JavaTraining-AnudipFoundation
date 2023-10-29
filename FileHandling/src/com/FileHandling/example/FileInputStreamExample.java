//Q.1)WAP to read and write data from text file using FileReader and FileWriter(Data is about Yourself).
package com.FileHandling.example;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String fileName = "about_me.txt"; // Change this to the path of the file you want to read

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int byteRead;

            System.out.println("Reading data from the file byte by byte:");
            
            // Read bytes one at a time and print them to the console
            while ((byteRead = fileInputStream.read()) != -1) {
            	// Convert the byte to a character and print
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
