package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.DTO.Aadhaar;

public class AadhaarCardFormatter implements Formatter<Aadhaar> {

	@Override
	public String print(Aadhaar object, Locale locale) {
		return null;
	}

	@Override
	public Aadhaar parse(String aadhaarNumber, Locale locale) throws ParseException {

		Aadhaar aadhaarObj = new Aadhaar();

		if (aadhaarNumber.length() != 8) {

			aadhaarObj.setFirstFourDigits("1234");
			aadhaarObj.setSecondFourDigits("0000");
			aadhaarObj.setThirdFourDigits("9876");
		}

		aadhaarObj.setFirstFourDigits(aadhaarNumber.substring(0, 3));
		aadhaarObj.setSecondFourDigits(aadhaarNumber.substring(4, 7));
		aadhaarObj.setThirdFourDigits(aadhaarNumber.substring(8, 11));

		return aadhaarObj;
	}

}
