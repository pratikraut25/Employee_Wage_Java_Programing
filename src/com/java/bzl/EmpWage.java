package com.java.bzl;
import java.util.*;
public class EmpWage {

	public static void main(String[] args) {

		float dailyWage;
		int wagePerHour = 20, fullDayHour = 0;
		
		System.out.println("Welcome to Employee Wage Computation Program.");

		Random random = new Random();
		boolean attendance = random.nextBoolean();
		boolean parttime = random.nextBoolean();

		
		if (attendance)
		if(parttime){
			System.out.println("Part time employee is present.");
			fullDayHour = 4;
		}
			else{
				System.out.println("Full time employee is present.");
				fullDayHour = 8;
			}
		else
			System.out.println("Employee is absent.");

		dailyWage = wagePerHour * fullDayHour;
		System.out.println("Daily wage of employee: " + dailyWage);
				
		}

}
