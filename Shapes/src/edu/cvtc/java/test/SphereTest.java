package edu.cvtc.java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.cvtc.java.Sphere;

public class SphereTest {
	MessageBoxSub messageBox = new MessageBoxSub();
	
	
	Sphere sphere1 = new Sphere(messageBox, 2);
	Sphere sphere2 = new Sphere(messageBox, 3);
	Sphere sphere3 = new Sphere(messageBox, 4);
	
	
	@Test
	public void testConstructor() {
		assertTrue(sphere1 instanceof Sphere);
	}
	
	@Test 
	public void testOneGetRadius() {
		assertEquals(2, sphere1.getRadius(), 0.1);
	}
	
	@Test 
	public void testTwoGetRadius() {
		assertEquals(3, sphere2.getRadius(), 0.1);
	}
	
	@Test 
	public void testThreeGetRadius() {
		assertEquals(4, sphere3.getRadius(), 0.1);
	}
	
	@Test
	public void testOneSurfaceArea() {
		assertEquals(50.26, sphere1.surfaceArea(), 0.01);
	}
	
	@Test
	public void testTwoSurfaceArea() {
		assertEquals(113.09, sphere2.surfaceArea(), 0.01);
	}
	
	@Test
	public void testThreeSurfaceArea() {
		assertEquals(201.06, sphere3.surfaceArea(), 0.01);
	}
	
	@Test
	public void testOneVolume() {
		assertEquals(33.50, sphere1.volume(), 0.01);
	}
	
	@Test
	public void testTwoVolume() {
		assertEquals(113.09, sphere2.volume(), 0.01);
	}
	
	@Test
	public void testThreeVolume() {
		assertEquals(268.07, sphere3.volume(), 0.01);
	}
	
	@Test
	public void testRender() {
		sphere1.render();
		sphere2.render();
		sphere3.render();
	}
}
