package com.java.bzl;
import java.util.*;
public class EmpWage {

   private static int PartTime=1;
private static final int Wage_Per_Hour = 20; 
private static int fullDayHour =2;
   private static float dailywage, monthlywage;
   private static int empPerDay, fullDayHour1, workingHoursPerMonth, day; 
	private static Random random = new Random();
	private static void findEmpWage() {
		workingHoursPerMonth = 0;
		monthlywage = 0;
		day = 0;
		System.out.println("\nWelcome to Employee Wage Computation Program.");
		while (workingHoursPerMonth <= 100 && day != 20) {
			day++;
			int attendance = random.nextInt(2);
			PartTime = 1 + random.nextInt(2);

			switch (attendance) {
			case 1:
				System.out.println("Employee is present!");
				switch (PartTime) {
				case 1:
					System.out.println("Employee is part time.");
					fullDayHour = 4;
					break;
				case 2:
					System.out.println("Employee is full time.");
					fullDayHour = 8;
				}
				break;
			case 0:
				System.out.println("Employee is absent.");

			}
			workingHoursPerMonth += fullDayHour;
			dailywage = Wage_Per_Hour * fullDayHour;
			monthlywage += dailywage;
			System.out.println("Day " + day + " wage of employee: " + dailywage + "\n");
		}
		System.out.println("\nMonth wage of employee: " + monthlywage);
		System.out.println("\nProgram runs total: " + day + " times.");
}
	public static void main(String[]args){
		findEmpWage();
	}

}