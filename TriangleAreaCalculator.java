package com.codegnan.fundamentals;
import java.util.Scanner;
public class TriangleAreaCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Base of the triangle");
		double base=scanner.nextDouble();
		System.out.println("Enter Height of the triangle");
		double height=scanner.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of Triangle:"+area);
		scanner.close();
		
		

	}

}
