package com.johnlewis.codingchallenge.pojo;

/**
 * POJO class for Time Components (Year, Day, Hour, Minute, Second)
 * 
 * @author David John
 * 
 */
public class TimeComponent {

	int value;
	String unit;

	public TimeComponent(int value, String unit) {
		super();
		this.value = value;
		this.unit = unit;
	}

	public int getValue() {
		return value;
	}

	public String getUnit() {
		return unit;
	}

}
