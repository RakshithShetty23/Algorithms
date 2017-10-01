/**
 * 
 */
package com.practice.main;

/**
 * @author Admin
 *
 */
public class Student {
	
	public static final String LAST_NAME = "Shetty"; 
	private int rollNumber;
	private String firstName;
	private String lastName;
	private String branchName;
//	public Student(int rollNumber, String firstName, String lastName, String branchName) {
//		super();
//		this.rollNumber = rollNumber;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.branchName = branchName;
//	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) 
	{
//	{
//		if(firstName.equalsIgnoreCase("rakshith")  && lastName.equalsIgnoreCase(LAST_NAME) && rollNumber == 30 && branchName=="cse"){
//			System.out.println("branch change");
//		}
				this.branchName = branchName;
	}
	
	

}
