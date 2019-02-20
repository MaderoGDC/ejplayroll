package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import data.Employee;
import data.Grad;
import data.Undergrad;

public class LoadingPeople {

	public static Undergrad readUndergrad(Scanner sc) {
		Undergrad newUndergrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String hours = sc.next().trim();
		int h = Integer.parseInt(hours);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newUndergrad = new Undergrad(id, name,hiringDate,dp,h);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newUndergrad;
	}

	public static Grad readGrad(Scanner sc) {
		Grad newGrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String courses = sc.next().trim();
		int c = Integer.parseInt(courses);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newGrad = new Grad(id, name,hiringDate,dp,c);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newGrad;
	}

	public static Employee readEmployee(Scanner sc) {
		String type = sc.next();
                System.out.println("kkjk" +type);
		if (type.equals("Grad")) return readGrad(sc);
		return readUndergrad(sc);
	}
	
	public static ArrayList<Employee> readStaff(String fileName) {
		ArrayList<Employee> people = new ArrayList<Employee>();
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				people.add(readEmployee(sc));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found -- " + fileName);
			e.printStackTrace();
		}
		return people;
	}
}
