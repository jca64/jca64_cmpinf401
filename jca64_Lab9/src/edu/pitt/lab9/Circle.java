package edu.pitt.lab9;

public class Circle {
	
	private double radius = 5.0;
	private String color = "Green";
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}
}
