package data;

import java.util.Date;

public class Grad extends Student{
	private int courses;

	public Grad(String id, String name, Date hiringDate, String department, int courses) {
		super(id, name, hiringDate, department);
		this.courses = courses;
	}


	// For grad students the salary depends on the number of courses they teach
	public float paySalary() {
		if (courses == 1) return 2000000;
		if (courses == 2) return 3500000;
		return 0;
	}
}
