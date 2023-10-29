//Q.2)WAP to create Generic Type to store Student information(roll_no,name,std). 
package com.generic.example;

public class StudentInfoStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo<Integer> obj1 = new StudentInfo<>(16);
		obj1.print();
		StudentInfo<String> obj2 = new StudentInfo<>("Purnima Mahato");
		obj2.print();
		StudentInfo<String> obj3 = new StudentInfo<>("7th sem");
		obj3.print();
		
	}

}
