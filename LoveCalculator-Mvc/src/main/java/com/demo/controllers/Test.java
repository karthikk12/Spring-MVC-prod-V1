package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.DTO.FoodDto;

@Controller
@ControllerAdvice
public class Test {

	@ModelAttribute("foodInfo")
	private FoodDto getFoodto() {

		System.out.println("-------------");

		System.out.println("Mode Attribute Method Called");

		FoodDto food = new FoodDto();

		food.setFoodCost("244");
		food.setFoodName("Maggie");
		System.out.println("-------------");
		return food;

	}

	@RequestMapping("/test")
	public String getTest(Model model) {

		return "test";
	}

	@RequestMapping("/secondtest")
	public String getsecondtest(@ModelAttribute("foodInfo") FoodDto dto) {

		System.out.println(dto.getFoodCost());

		System.out.println(dto.getFoodName());

		return "test";
	}

}
