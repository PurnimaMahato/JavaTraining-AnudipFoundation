//Q.2)WAP to demonstrate the working of FileInputStream using read() method.
package com.FileHandling.example;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
    	//Define the file path
        String fileName = "about_me.txt";

        // Read data from the file using FileReader
        try (FileReader fileReader = new FileReader(fileName)) {
            StringBuilder data = new StringBuilder();
            int character;
            while ((character = fileReader.read()) != -1) {
                data.append((char) character);
            }
            System.out.println("Data read from the file:");
            System.out.println(data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write data to the file using FileWriter
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            String newData = "My name is Purnima Mahato. I am a software developer.";
            fileWriter.write(newData);
            System.out.println("Data has been successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display the updated data from the file
        try (FileReader fileReader = new FileReader(fileName)) {
            StringBuilder updatedData = new StringBuilder();
            int character;
            while ((character = fileReader.read()) != -1) {
                updatedData.append((char) character);
            }
            System.out.println("Updated data in the file:");
            System.out.println(updatedData.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


