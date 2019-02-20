package ui;

import java.util.ArrayList;
import java.util.Scanner;

import data.Employee;

public class UI {
	public static String readFileName() {
		System.out.println("Please, write the filename: ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		sc.close();
		return fileName;
	}
	
	public static void showSalaries(ArrayList<Employee> payroll) {
		// Paying monthly salaries to all workers ...
		for(int i=0; i<payroll.size(); i++) {
			float sal = payroll.get(i).paySalary();
			String name = payroll.get(i).getName();
			System.out.println("NAME: " + name + "  SALARY: " + sal);
		}		
	}
}
