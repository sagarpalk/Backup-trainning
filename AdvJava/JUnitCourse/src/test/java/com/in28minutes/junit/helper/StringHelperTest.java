package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test // this will says this is specific test method
	public void testTruncateAInFirst2Positions() {

		// fail says one of method in series of assert method
//	   fail("Not yet implemented");
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// assertEquals("dssa", helper.truncateAInFirst2Positions("dssa"));
		// assert(Expected,actual);
	}

	@Test
	public void test2TruncateAInFirst2Positions() {
		// fail says one of method in series of assert method
//		   fail("Not yet implemented");
		StringHelper helper = new StringHelper();

		assertEquals("dssa", helper.truncateAInFirst2Positions("dssa"));
		// assert(Expected,actual);

	}

	@Test
	public void test3TruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		assertEquals("Help", helper.truncateAInFirst2Positions("AHelp"));

	}

	@Test
	public void test4TruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));

	}

	@Test
	public void test5TruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));

	}

}
