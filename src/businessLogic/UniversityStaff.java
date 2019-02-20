package businessLogic;

import java.util.ArrayList;

import data.Employee;
import ui.UI;

public class UniversityStaff {
	public static ArrayList<Employee> payroll;

	public static void main(String[] args) {
		// Reading the input file name
		String fileName = UI.readFileName();
		
		// Reading workers' data from a text file ...
		payroll = LoadingPeople.readStaff(fileName);

		// Paying monthly salaries to all workers ...
		UI.showSalaries(payroll);	
	}
}
