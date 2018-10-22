

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JVector.Vector;
package org.institutoserpis.ed;



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

}
