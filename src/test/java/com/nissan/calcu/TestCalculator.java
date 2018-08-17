package com.nissan.calcu;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestCalculator {


		calaculator c=new calaculator();
		
		@Test
		public void sumtest() {
			assertEquals(7,c.sum(5, 2));
		}
		
		@Test
		public void subtest() {
			assertEquals(3,c.sub(5, 2));
		}
	

}
