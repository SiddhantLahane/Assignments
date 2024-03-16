package org.example.main;


class Employee{
	
	public void details(int empID, int salary) {
		System.out.println("empID is "+empID+" salary is "+salary);
	}
	
	public void details(String name) {
		System.out.println("name is "+name);
	}
	
	public void details(int empID, String name) {
		System.out.println("empID is "+empID+" name is "+name);
	}
	
	public void details(int empID, int salary, String name) {
		System.out.println("empID is "+empID+" salary is "+salary+" name is "+name);
	}
	
}



public class Program {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.details(1100, 85000);
		e.details("Siddhant");
		e.details(2000, "Onkar");
		e.details(8300, 98000, "Sid");
		

	}

}
