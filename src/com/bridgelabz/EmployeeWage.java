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
	static final int wagePerHour = 20;
	static final int fullDayHour = 1;
	static final int partTimeHour = 2;
	static final int wagePerDay = 0;
	static final int numOfWorkingDays=2;
	
	static int monthlyHrs=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs =0, totalemprs = 0, totalWorkingDays=0;	
		while(totalemprs <= monthlyHrs && totalWorkingDays < numOfWorkingDays ) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() *10) % 3;
			switch(empCheck) {
			case partTimeHour:
				empHrs=4;
				break;
			case fullDayHour:
				empHrs=8;
				break;
			default:
				empHrs = 0;
			}
			totalemprs +=empHrs;
			System.out.println(totalWorkingDays + "emp hr:" +empHrs );
		}
		int totalEmpWage = totalemprs * wagePerHour;
		System.out.println("TotalEmpWage:"+ totalEmpWage );
	}
}