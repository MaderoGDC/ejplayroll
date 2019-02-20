package data;

import java.util.Date;

public abstract class Student extends Employee{
	protected String department;

	public Student(String id, String name, Date hiringDate, String department) {
		super(id, name, hiringDate);
		this.department = department;
	}

}
