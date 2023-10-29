package com.dateTimeCurrency.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a LocalDate object representing today's date
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: " + today);
		//add 1 week to the current date
		LocalDate nextweek = today.plusWeeks(1);
		System.out.println("Next week date: " + nextweek);
		// Format the date using a specific pattern
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = today.format(formatter);
		System.out.println("Formatted date: " + formattedDate);
	}

}
