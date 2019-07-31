package com.hashcode.equals;

import com.base.classes.Student;

public class VerifyHashCodeEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student(11, "Kumar");
		Student s3 = new Student(101, "Kumar");
		
		if (s2.equals(s3)){
			
			System.out.println("Both are same");
		} else {
			
			System.out.println("Not Same");
			
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Printing Hash code:");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
