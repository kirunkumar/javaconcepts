package com.qa.compare;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.base.classes.Student;

public class ComparableImplemantationExample {
	
	public static void main(String[] args) {
		
		List<Student> lstStudents = new ArrayList<Student> ();
		
		lstStudents.add(new Student(101, "kiran1"));
		lstStudents.add(new Student(42, "udfsgs"));
		lstStudents.add(new Student(21, "dfhashsa"));
		lstStudents.add(new Student(56, "sdzvzb"));
		lstStudents.add(new Student(98, "sgeggwhw"));
		
		
		System.out.println("Before Sort");
		
		for(Student s: lstStudents)
			System.out.println(s);
		
		Collections.sort(lstStudents);
		
		System.out.println("After Sort");
		
		for(Student s: lstStudents)
			System.out.println(s);
	}

}
