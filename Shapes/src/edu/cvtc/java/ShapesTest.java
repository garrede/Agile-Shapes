package edu.cvtc.java;

public class ShapesTest {

	public static void main(String[] args) {
		
		Dialog messageBox = new MessageBox();
		
		ShapeFactory shapeFactory = new ShapeFactory(messageBox);
		
		Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
		
		Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
		
		Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);
		
		cylinder.render();
		cuboid.render();
		sphere.render();

	}
}