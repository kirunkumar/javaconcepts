package com.base.classes;

import java.util.concurrent.Callable;

public class Student implements Comparable<Student> {
	
	int marks;

	String Name;
	
	
	
	public Student() {
		this.marks =100;
		this.Name = "Kiran";
	}
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + marks;
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
/*		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (marks != other.marks)
			return false;
		return true;*/
		
		
		// checking if both the object references are  
	    // referring to the same object. 
	    if(this == obj) 
	            return true; 
	          
	        // it checks if the argument is of the  
	        // type Geek by comparing the classes  
	        // of the passed argument and this object. 
	        // if(!(obj instanceof Geek)) return false; ---> avoid. 
	        if(obj == null || obj.getClass()!= this.getClass()) 
	            return false; 
	          
	        // type casting of the argument.  
	        Student geek = (Student) obj; 
	          
	        // comparing the state of argument with  
	        // the state of 'this' Object. 
	        return (geek.Name == this.Name && geek.marks == this.marks); 
	        
	        //return (geek.Name == this.Name);

		
		
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", Name=" + Name + "]";
		//return "Student [marks=" + marks + "";
	}
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return 0;
		
		//return this.marks- o.marks;
		return this.Name.compareTo(o.Name);
	}

}
