package edu.cvtc.java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.cvtc.java.Cylinder;

public class CylinderTest {

	MessageBoxSub messageBox = new MessageBoxSub();
	
	Cylinder cyl1 = new Cylinder(messageBox, 2, 3);
	Cylinder cyl2 = new Cylinder(messageBox, 3, 4);
	Cylinder cyl3 = new Cylinder(messageBox, 5, 6);
	
	
	@Test
	public void testConstructor() {
		assertTrue(cyl1 instanceof Cylinder);
	}
	
	@Test 
	public void testOneGetRadius() {
		assertEquals(2, cyl1.getRadius(), 0.1);
	}
	
	@Test 
	public void testTwoGetRadius() {
		assertEquals(3, cyl2.getRadius(), 0.1);
	}
	
	@Test 
	public void testThreeGetRadius() {
		assertEquals(5, cyl3.getRadius(), 0.1);
	}
	
	@Test 
	public void testOneGetHeighth() {
		assertEquals(3, cyl1.getHeight(), 0.1);
	}
	
	@Test 
	public void testTwoGetHeight() {
		assertEquals(4, cyl2.getHeight(), 0.1);
	}
	
	@Test 
	public void testThreeGetHeight() {
		assertEquals(6, cyl3.getHeight(), 0.1);
	}
	
	@Test
	public void testOneSurfaceArea() {
		assertEquals(62.83, cyl1.surfaceArea(), 0.01);
	}
	
	@Test
	public void testTwoSurfaceArea() {
		assertEquals(131.95, cyl2.surfaceArea(), 0.01);
	}
	
	@Test
	public void testThreeSurfaceArea() {
		assertEquals(345.58, cyl3.surfaceArea(), 0.01);
	}
	
	@Test
	public void testOneVolume() {
		assertEquals(37.69, cyl1.volume(), 0.01);
	}
	
	@Test
	public void testTwoVolume() {
		assertEquals(113.09, cyl2.volume(), 0.01);
	}
	
	@Test
	public void testThreeVolume() {
		assertEquals(471.23, cyl3.volume(), 0.01);
	}
	
	@Test
	public void testRender() {
		cyl1.render();
		cyl2.render();
		cyl3.render();
	}
	
	
}
