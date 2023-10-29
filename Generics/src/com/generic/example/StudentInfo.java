//Q.2)WAP to create Generic Type to store Student information(roll_no,name,std). 
package com.generic.example;

public class StudentInfo<T> {
	T thingsToStore;
	//this is generic store 
	public StudentInfo(T thingsToStore) {
		this.thingsToStore = thingsToStore ;
	}
	//print the data
	public void print() {
		System.out.println(thingsToStore);
	}
	

}
