
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
}
