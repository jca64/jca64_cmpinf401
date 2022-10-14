package edu.pitt.lab6;

public class MyRectangle {

	private int startX;
	private int startY;
	private int width;
	private int height;
	
	public MyRectangle() {
		startX = 0;
		startY = 0;
		width = 0;
		height = 0;
	}
	
	public MyRectangle(int x, int y, int w, int h) {
		startX = x;
		startY = y;
		width = w;
		height = h;
	}
	
	public int area() {
		return(this.width * this.height);
	}
	
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	
	public boolean isInside(int x, int y) {
		if((x>=this.startX && x<=(this.startX+this.width)) && (y>=this.startY && y<=(this.startY+this.height))) {
			return true;
		}
		return false;
	}
	
	public void setSize(int newWidth, int newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}
	
	public void setPosition(int newX, int newY) {
		this.startX = newX;
		this.startY = newY;
	}
}
