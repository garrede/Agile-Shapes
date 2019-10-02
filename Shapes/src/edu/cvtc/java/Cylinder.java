package edu.cvtc.java;

public class Cylinder extends Shape implements Renderer {
	
	// Variables
	private float radius = 0;
	private float height = 0;
	final double PI = Math.PI;
	

	
	// Overlaoded constructor
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		this.radius = radius;
		this.height = height;
	}

	// getters and setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	// Override functions
	@Override
	public float surfaceArea() {
		return (float) Math.round((2 * PI * radius * height + 2 * PI * Math.pow(radius, 2)) * 100) / 100;
	}

	@Override
	public float volume() {
		return (float) (PI * Math.pow(radius, 2) * height);
	}

	@Override
	public void render() {
		this.getMessageBox().Show("The radius is: "+ this.getRadius() + 
				" the height is: " + this.getHeight() + 
				" the surface area is: " + surfaceArea() + 
				" the volume is: " + volume() + ".", "");
	}

	
	
	
}
