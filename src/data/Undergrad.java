package data;

import java.util.Date;

public class Undergrad extends Student {
	private int weekHours;
	private static float smlv = 655000;

	public Undergrad(String id, String name, Date hiringDate, String department, int weekHours) {
		super(id, name, hiringDate, department);
		this.weekHours = weekHours;
	}


	// For undergrad students the salary depends on the hours they work per week
	// Here we assume they earn 1 or 2 SMLV 
	public float paySalary() {
		if (weekHours == 6) return smlv/ 3;
		return (2 * smlv) /3;
	}

}
