package com.demo.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.demo.DTO.Phone;

public class PhoneNoFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone Phoneobject, Locale locale) {

		System.out.println("Inside print");

		return Phoneobject.getCountryCode() + "-" + Phoneobject.getNumbers();
	}

	@Override
	public Phone parse(String phoneText, Locale locale) throws ParseException {

		Phone ph = new Phone();

		System.out.println("Inside parse");

		if (!phoneText.contains("-")) {

			phoneText = "91-" + phoneText;

		}
		if (phoneText.contains("-") && phoneText.indexOf("-") != 2) {

			phoneText = "91" + phoneText;

		}

		String[] arr = phoneText.split("-");

		ph.setCountryCode(arr[0]);

		ph.setNumbers(arr[1]);

		return ph;
	}

}
