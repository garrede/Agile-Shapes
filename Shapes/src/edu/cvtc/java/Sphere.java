package edu.cvtc.java;

public class Sphere extends Shape implements Renderer {

	// Variables
	private float radius = 0;
	final double PI = Math.PI;

	// Overloaded constructor
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		this.radius = radius;
	}

	// Getters and setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	// Override functions
	@Override
	public float surfaceArea() {
		return (float) (4 * PI * Math.pow(radius, 2));
	}

	@Override
	public float volume() {
		return (float) (1.3333 * Math.PI *  Math.pow(radius, 3));
	}

	@Override
	public void render() {
		this.getMessageBox().Show("The radius is: "+ this.getRadius() + " the surface area is: " + surfaceArea() + " the volume is: " + volume() + ".", "");
	}

	
}