package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.demo.DTO.FoodDto;

@Controller
public class TestCont2 {

	@RequestMapping("/newcont")
	public String thirdTest(@ModelAttribute("foodInfo") FoodDto dtoa) {

		System.out.println(dtoa.getFoodCost());

		System.out.println(dtoa.getFoodName());

		return "test";
	}

}
