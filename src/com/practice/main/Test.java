/**
 * 
 */
package com.practice.main;

/**
 * @author Admin
 *
 */
public class Test {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("hello rakshith");

//		Student studentRakshith = new Student(30, "Rakshith", Student.LAST_NAME, "CSE");
//		Student studentRaksha = new Student(31, "Rakha", Student.LAST_NAME, "CSE");
		
//		Student studentRakshith = new Student();
//		studentRakshith.setBranchName("CSE");
//		studentRakshith.setLastName("CSE");
//		studentRakshith.setFirstName("CSE");
//		studentRakshith.setRollNumber(30);
//		
//		Student studentRaksha1 = new Student();
//		studentRaksha1.setBranchName("CSE");
//		studentRaksha1.setLastName("CSE");
//		studentRaksha1.setFirstName("CSE");
//		studentRaksha1.setRollNumber(10);
		
		Student studentRakshith = createStudentObject(30, "CSE");

		Student studentRaksha = createStudentObject(10, "CSE");
		
		printingObject(studentRakshith);
		printingObject(studentRaksha);
		
		
//		System.out.println(studentRakshith.getBranchName());
//		studentRakshith.setBranchName("mech"); 
//		System.out.println(studentRakshith.getBranchName());
//		System.out.println(studentRaksha1);

	}

	public static Student createStudentObject(int rollNo, String branch){
		Student student = new Student();
		student.setBranchName(branch);
//		studentRakshith.setLastName("CSE");
//		studentRakshith.setFirstName("CSE");
		student.setRollNumber(rollNo);	
		return student;
	}
	public static void printingObject(Student student){
		
	
		System.out.println(student.getBranchName());
		System.out.println(student.getRollNumber());
		
	}
}
