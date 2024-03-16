package org.example.main;


class VehicleInfo{
	
	 public void info(String name) {
		System.out.println("name of the car is "+ name);
	}
	 
	 public void info(int price, String name) {
		 System.out.println("price of the car is "+price+" name of the car is "+name);
	 }
	 
	 public void info(int price, float avg) {
		 System.out.println("price of the car is "+price+" avg of the car is "+avg);
	 }
}

public class Vehicle {
	

	public static void main(String[] args) {
//		Write a Vehicle class with overloaded methods that have a different number of parameters.
//		Demonstrate calling these overloaded methods with various numbers of arguments.
		
		VehicleInfo v = new VehicleInfo();
		v.info(2500000, 23.45f);
		v.info(5000000, "fortuner");
		v.info("BMW");
		

	}

}
