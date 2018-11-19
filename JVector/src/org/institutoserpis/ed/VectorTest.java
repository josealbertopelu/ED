
package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




class VectorTest {

	@Test
	void testIndexOf() {
		int[] v = new int[] {16,12,15,14,17};
		assertEquals(0, Vector.indexOf(v, 16));
		assertEquals(2, Vector.indexOf(v, 15));
		assertEquals(4, Vector.indexOf(v,17));
		assertEquals(-1, Vector.indexOf(v,33));


	
		
	}
	@Test
	void indexOfEmpty() {
		int[] v = new int[] {};
		assertEquals(-1, Vector.indexOf(v, 22));
	}

	@Test
	void min() {
		assertEquals(12,Vector.min(new int[] {16,12,15,14,17}));
		assertEquals(12,Vector.min(new int[] {12,16,15,14,17}));
		assertEquals(12,Vector.min(new int[] {16,15,14,17,12}));
		assertEquals(2,Vector.min(new int[] {2}));
		assertEquals(-33,Vector.min(new int[] {16,15,14,17,12,-1,-33}));
	}
	
	
	@Test
	void indexOfMin() {
		assertEquals(1,Vector.indexOfMin(new int[] {16,12,15,14,17}));
		assertEquals(0,Vector.indexOfMin(new int[] {12,16,15,14,17}));
		assertEquals(4,Vector.indexOfMin(new int[] {16,15,14,17,12}));
		assertEquals(0,Vector.indexOfMin(new int[] {2}));
		assertEquals(6,Vector.indexOfMin(new int[] {16,15,14,17,12,-1,-33}));
		
}
	
	@Test
	void sort() {
		int[] v = new int[] {15,12};
		Vector.sort(v);
		assertArrayEquals(new int[]{12,15},v);
		
		int[] w = new int[] {17,12,15};
		Vector.sort(w);
		assertArrayEquals(new int[] {12,15,17}, w);
	
		int[] x = new int[] {30,-4,5,8};
		Vector.sort(x);
		assertArrayEquals(new int[] {-4,5,8,30},x);
		
	}
}
