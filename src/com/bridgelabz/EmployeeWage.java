/**
 * 
 */
package com.bridgelabz;
import java.util.Random; 
/**
 * @author PAVITHRA C
 *
 */
public class EmployeeWage {

	/**
	 * @param args
	 * 
	 * UC1
	 * EmployeeWage Present or Not
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(3); // Generate 3 random number 0,1,2

		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int wagePerDay = 0;

		if (attendance == 2) {
			System.out.println("Employee Full Day Present....");
			wagePerDay = wagePerHour * fullDayHour;
		} else if (attendance == 1) {
			System.out.println("Employee Part Time Present");
			wagePerDay = wagePerHour * partTimeHour;
		} else
			System.out.println("Employee Absent");

		System.out.println("Employee Wage Per Day :-" + wagePerDay);
	}

}