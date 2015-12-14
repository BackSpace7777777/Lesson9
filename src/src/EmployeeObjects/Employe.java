package src.EmployeeObjects;
abstract public class Employe {
	protected String name;
	protected double rate,hours;
        protected boolean ft;
	public Employe() {
	 name = "";
	 rate = 0;
	 hours = 0;	
	}
        public boolean getFT()
        {
            return ft;
        }
	public String getNameRules() {
	 	return "nonblank";
	}
	public String getRateRules() {
		return "between 6.75 and 30.50, inclusive";
	}
	public String getHoursRules() {
		return "between 1 and 60, inclusive";
	}
	public void setName(String nm) {
		name=nm;
	}
	public String getName() {
		return name;
	}
        public void setHours(double h)
        {
            hours=h;
        }
        public void setRate(double r)
        {
            rate=r;
        }
        public double getHours()
        {
            return hours;
        }
        public double getRate()
        {
            return rate;
        }
        
}
