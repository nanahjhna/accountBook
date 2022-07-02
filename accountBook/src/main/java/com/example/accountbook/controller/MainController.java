package com.example.accountbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.beans.CalculateMonthDto;
import com.example.accountbook.service.CalculateService;

@Controller
public class MainController {

	CalculateService calculateController = new CalculateService();

	@RequestMapping(value ="/")
	public String hello(Model model) {
		CalculateService calculateService = new CalculateService();
		CalculateMonthDto calculateMonthDto = calculateService.monthCalculate("20220601", 1110);

		model.addAttribute("calculateMonthDtoResult",calculateMonthDto);
		return "main";
	}



}