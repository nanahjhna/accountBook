package com.beans;

public class CalculateMonthDto {
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonthSum() {
		return monthSum;
	}
	public void setMonthSum(String monthSum) {
		this.monthSum = monthSum;
	}
	private String year;
	private String month;
	private String day;
	private String monthSum;
}
