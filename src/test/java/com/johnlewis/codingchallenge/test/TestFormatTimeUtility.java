package com.johnlewis.codingchallenge.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.johnlewis.codingchallenge.utility.FormatTimeUtility;


/**
 * Test class for {@link FormatTimeUtility}
 * 
 * @author David John
 *
 */
public class TestFormatTimeUtility {

	@Test
	public void testForZeroSeconds() {
		assertEquals("none", FormatTimeUtility.formatTime(0));
	}
	
	@Test
	public void testForSecondsComponent() {
		assertEquals("1 second", FormatTimeUtility.formatTime(1));
		assertEquals("59 seconds", FormatTimeUtility.formatTime(59));
	}
	
	@Test
	public void testForMinutesComponent() {
		assertEquals("1 minute", FormatTimeUtility.formatTime(60));
		assertEquals("59 minutes", FormatTimeUtility.formatTime(3540));
	}
	
	@Test
	public void testForHoursComponent() {
		assertEquals("1 hour", FormatTimeUtility.formatTime(3600));
		assertEquals("23 hours", FormatTimeUtility.formatTime(82800));
	}
	
	@Test
	public void testForDaysComponent() {
		assertEquals("1 day", FormatTimeUtility.formatTime(86400));
		assertEquals("364 days", FormatTimeUtility.formatTime(31449600));
	}
	
	@Test
	public void testForYearsComponent() {
		assertEquals("1 year", FormatTimeUtility.formatTime(31536000));
		assertEquals("2 years", FormatTimeUtility.formatTime(63072000));
	}
	
	@Test
	public void testForAllTimeComponents() {
		assertEquals("1 year, 364 days, 23 hours, 59 minutes and 59 seconds", FormatTimeUtility.formatTime(63071999));
		assertEquals("1 minute and 2 seconds", FormatTimeUtility.formatTime(62));
		assertEquals("1 hour, 1 minute and 2 seconds", FormatTimeUtility.formatTime(3662));
		assertEquals("1 year, 1 day, 1 minute and 1 second", FormatTimeUtility.formatTime(31622461));
	}

}
