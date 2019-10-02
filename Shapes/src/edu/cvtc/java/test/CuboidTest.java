package edu.cvtc.java.test;

import edu.cvtc.java.Cuboid;

import static org.junit.Assert.*;
import org.junit.Test;

public class CuboidTest {
	
	MessageBoxSub messageBox = new MessageBoxSub();
	
	Cuboid cube1 = new Cuboid(messageBox, 2, 2, 2);
	Cuboid cube2 = new Cuboid(messageBox, 2, 3, 4);
	Cuboid cube3 = new Cuboid(messageBox, 3, 4, 5);
	
	@Test
	public void testConstructor() {
		assertTrue(cube1 instanceof Cuboid);
	}
	
	@Test 
	public void testOneGetWidth() {
		assertEquals(2, cube1.getWidth(), 0.1);
	}
	
	@Test 
	public void testTwoGetWidth() {
		assertEquals(2, cube2.getWidth(), 0.1);
	}
	
	@Test 
	public void testThreeGetWidth() {
		assertEquals(3, cube3.getWidth(), 0.1);
	}
	
	@Test 
	public void testOneGetHeighth() {
		assertEquals(2, cube1.getHeight(), 0.1);
	}
	
	@Test 
	public void testTwoGetHeight() {
		assertEquals(3, cube2.getHeight(), 0.1);
	}
	
	@Test 
	public void testThreeGetHeight() {
		assertEquals(4, cube3.getHeight(), 0.1);
	}
	
	@Test 
	public void testOneGetDepth() {
		assertEquals(2, cube1.getDepth(), 0.1);
	}
	
	@Test 
	public void testTwoGetDepth() {
		assertEquals(4, cube2.getDepth(), 0.1);
	}
	
	@Test 
	public void testThreeGetDepth() {
		assertEquals(5, cube3.getDepth(), 0.1);
	}
	
	@Test
	public void testOneSurfaceArea() {
		assertEquals(24, cube1.surfaceArea(), 0.01);
	}
	
	@Test
	public void testTwoSurfaceArea() {
		assertEquals(52, cube2.surfaceArea(), 0.01);
	}
	
	@Test
	public void testThreeSurfaceArea() {
		assertEquals(94, cube3.surfaceArea(), 0.01);
	}
	
	@Test
	public void testOneVolume() {
		assertEquals(8, cube1.volume(), 0.01);
	}
	
	@Test
	public void testTwoVolume() {
		assertEquals(24, cube2.volume(), 0.01);
	}
	
	@Test
	public void testThreeVolume() {
		assertEquals(60, cube3.volume(), 0.01);
	}
	
	@Test
	public void testRender() {
		cube1.render();
		cube2.render();
		cube3.render();
	}
	
}
