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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
	      
		Random random= new Random();
		int attendance=random.nextInt(2);
		
		if(attendance == 1)
			System.out.println("Employee Present..");
		else
			System.out.println("Employee Absent..");
	}

}
