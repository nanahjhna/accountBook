package com.example.accountbook.service;

import org.springframework.stereotype.Controller;
import com.beans.CalculateMonthDto;

@Controller
public class CalculateService {

	public CalculateMonthDto monthCalculate(String yyyyMMdd, int b) {
		CalculateMonthDto calculateMonthDto = new CalculateMonthDto();
		calculateMonthDto.setYear(yyyyMMdd.substring(0, 4));
		calculateMonthDto.setMonth(yyyyMMdd.substring(5, 6));
		calculateMonthDto.setDay(yyyyMMdd.substring(7, 8));
		calculateMonthDto.setMonthSum(String.valueOf(110000));

		return calculateMonthDto;
	}
}