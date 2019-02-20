package data;

import java.util.Date;

public abstract class Employee extends Person {
	private Date hiringDate;
	
	public Employee(String id, String name, Date hiringDate) {
		super(id, name);
		this.hiringDate = hiringDate;
	}

	public abstract float paySalary();
}
