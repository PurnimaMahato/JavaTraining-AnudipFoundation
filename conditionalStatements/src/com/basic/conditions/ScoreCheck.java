package com.basic.conditions;
import java.util.Scanner;
public class ScoreCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ind , Pak ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score of India .");
		Ind = sc.nextInt();
		System.out.println("Enter the score of Pakistan .");
		Pak = sc.nextInt();
		
		if(Ind>Pak)
		{
			System.out.println("India has won the match .");
		}
		else if(Pak>Ind)
		{
			System.out.println("Pakistan has won the match .");

		}
		else {
			System.out.println("The match is draw .");
		}
		sc.close();
	}

}
