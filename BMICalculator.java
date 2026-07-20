package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Input Your Weight in Pounds");
		double weightInLb=scan.nextDouble();
		System.out.println("Input Your Height in Meters");
		double heightInM=scan.nextDouble();
		
		//To convert weight from lb to kg
		double weightInKg=weightInLb*0.453592;
		double bmi = weightInKg/(heightInM*heightInM);
		System.out.println("Your BMI is"+" "+ bmi);
		
		if (bmi<=18.5)
		{
			System.out.println("You are underweight");
		}
		else if (bmi>18.5 && bmi <=24.9)
		{
			System.out.println("You are Normal");
		}	
		else if (bmi>24.9 && bmi <=29.9)
		{
			System.out.println("You are Overweight");
		}
		else 
		{
			System.out.println("You are Obese");
		}
	}

}
