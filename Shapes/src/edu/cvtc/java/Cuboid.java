package edu.cvtc.java;

public class Cuboid extends Shape implements Renderer {

	// variables
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	
	// Overloaded constructor
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Getters and setters
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Width must be positive");
		} else {
		this.width = width;
		}
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	// Override functions
	@Override
	public float surfaceArea() {
		return (width * height + width * depth + height * depth) * 2;
	}

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return depth * width * height;
	}

	@Override
	public void render() {
		this.getMessageBox().Show("The width is: "+ this.getWidth() + 
				" the height is: " + this.getHeight() + 
				" the depth is: " + this.getDepth() +
				" the surface area is: " + surfaceArea() + 
				" the volume is: " + volume() + ".", "Cuboid");
		
	}
	

	
	
}