package edu.pitt.lab9;

public class Staff extends Person {

	private String school;
	private double pay;
	
	public Staff(String n, String a, double p) {
		super.setName(n);
		super.setAddress(a);
		
		pay = p;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public static void main(String[] args) {
		Staff s = new Staff("Jeff", "123 Sesame Street", 120000.0);
		
		System.out.println(s.getSchool());
	}
}
