package src.EmployeeObjects;
abstract public class Employe {
	private String name;
	private int type;
	private double rate;
	private int hours;	
	
	public Employe() {
	 name = "";
	 type = 0;
	 rate = 0;
	 hours = 0;	
	}

	
	public String getNameRules() {
	 	return "nonblank";
	}

	public String getTypeRules() {
		return "1 or 2";
	}


	public String getRateRules() {
		return "between 6.75 and 30.50, inclusive";
	}

	
	public String getHoursRules() {
		return "between 1 and 60, inclusive";
	}

	public boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
		}
	}

	
	public boolean setType(int tp) {
		if (tp != 1 && tp != 2)
			return false;
		else{
			type=tp;
			return true;
		}
	}

	
	public boolean setRate(double rt) {
		if (rt < 6.75 || rt > 30.50)
			return false;
		else{
			rate=rt;
			return true;
		}
	}

	public boolean setHours(int hrs) {
		if (hrs < 1 || hrs > 60)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public double getPay() {
		if (hours <=40 || type == 2)
			return rate * hours;
		else
			return rate * 40 + (hours-40)*(rate*2);
	}	
}
