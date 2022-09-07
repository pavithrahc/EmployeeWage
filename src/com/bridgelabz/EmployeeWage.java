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

		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int wagePerDay = 0;
		int monthlySalary = 0;

		for (int day = 1; day <= 20; day++) {

			int attendance = random.nextInt(3); // Generate 3 random number 0,1,2
			System.out.println("randomNumber"+attendance);
			wagePerDay =0;
			switch (attendance) {

			case 0:
				System.out.println("Employee Absent");
				break;

			case 1:
				System.out.println("Employee Part Time Present");
				wagePerDay = partTimeHour * wagePerHour;
				break;
			default:
				System.out.println("Employee Full Day Present..");
				wagePerDay = wagePerHour * fullDayHour;
				break;
			}

			monthlySalary = monthlySalary + wagePerDay;
			System.out.println(day + " : " + monthlySalary);
		}
	}

}
	
