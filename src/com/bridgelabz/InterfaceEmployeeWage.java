/**
 * 
 */
package com.bridgelabz;

/**
 * @author PAVITHRA C
 *
 */
public interface InterfaceEmployeeWage {

	/**
	 * @param args
	 */
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDay, int totalWorkHrs);

	public void calculateEmployeeWage();

	public int getTotalWage(String company);

}