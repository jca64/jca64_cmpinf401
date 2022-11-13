package edu.pitt.lab9;

public class Cylinder extends Circle{
	
	double height = 1.0;
	
	public Cylinder() {
		super();
	}
	
	public Cylinder(double r, double h) {
		super(r);
		height = h;
	}
	
	public Cylinder(double r, double h, String c) {
		super(r, c);
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return(getArea() * getHeight());
	}
}
