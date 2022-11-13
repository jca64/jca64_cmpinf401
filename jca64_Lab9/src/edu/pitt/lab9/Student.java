package edu.pitt.lab9;

public class Student extends Person {
	
	private String program;
	private int year;
	private double fee;
	
	public Student(String n, String a, String p, int y, double f) {
		super.setName(n);
		super.setAddress(a);
		
		program = p; 
		year = y;
		fee = f;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString() {
		return super.toString();
	}
}
