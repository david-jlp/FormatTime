package com.johnlewis.codingchallenge.utility;

import java.util.ArrayList;

import com.johnlewis.codingchallenge.pojo.TimeComponent;

/**
 * Utility class for formatting time.
 * 
 * @author David John
 * 
 */
public class FormatTimeUtility {

	/**
	 * Method to accept time in seconds and return the formatted time in the
	 * required format
	 * 
	 * @param totalSeconds
	 * @return formatted time
	 */
	public static String formatTime(int totalSeconds) {
		String formattedTime = "";

		ArrayList<TimeComponent> timeComponents = new ArrayList<>();

		// Adding the year component into timeComponents list
		int years = totalSeconds / 31536000;
		if (years != 0) {
			if (years == 1) {
				timeComponents.add(new TimeComponent(years, "year"));
			} else {
				timeComponents.add(new TimeComponent(years, "years"));
			}
		}

		// Adding the day component into timeComponents list
		int days = totalSeconds % 31536000 / 86400;
		if (days != 0) {
			if (days == 1) {
				timeComponents.add(new TimeComponent(days, "day"));
			} else {
				timeComponents.add(new TimeComponent(days, "days"));
			}
		}

		// Adding the hour component into timeComponents list
		int hours = totalSeconds % 86400 / 3600;
		if (hours != 0) {
			if (hours == 1)
				timeComponents.add(new TimeComponent(hours, "hour"));
			else
				timeComponents.add(new TimeComponent(hours, "hours"));
		}

		// Adding the minute component into timeComponents list
		int minutes = totalSeconds % 3600 / 60;
		if (minutes != 0) {
			if (minutes == 1)
				timeComponents.add(new TimeComponent(minutes, "minute"));
			else
				timeComponents.add(new TimeComponent(minutes, "minutes"));
		}

		// Adding the second component into timeComponents list
		int sec = totalSeconds % 60;
		if (sec != 0) {
			if (sec == 1)
				timeComponents.add(new TimeComponent(sec, "second"));
			else
				timeComponents.add(new TimeComponent(sec, "seconds"));
		}

		// If there are no time components
		if (timeComponents.size() == 0) {
			formattedTime = "none";
		}
		// If there is only one time component
		else if (timeComponents.size() == 1) {
			formattedTime = timeComponents.get(0).getValue() + " "
					+ timeComponents.get(0).getUnit();
		}
		// Iterate through all the time components
		else {
			for (int i = 0; i < timeComponents.size() - 1; i++) {
				formattedTime += timeComponents.get(i).getValue() + " "
						+ timeComponents.get(i).getUnit();
				if (i < timeComponents.size() - 2) {
					formattedTime = formattedTime + ", ";
				}
			}
			formattedTime += " and "
					+ timeComponents.get(timeComponents.size() - 1).getValue()
					+ " "
					+ timeComponents.get(timeComponents.size() - 1).getUnit();
		}
		return formattedTime;
	}

}
