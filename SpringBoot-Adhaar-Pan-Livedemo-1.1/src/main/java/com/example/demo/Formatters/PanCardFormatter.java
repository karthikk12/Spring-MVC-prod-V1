package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.DTO.PanCard;

public class PanCardFormatter implements Formatter<PanCard> {

	@Override
	public String print(PanCard object, Locale locale) {
		return null;
	}

	@Override
	public PanCard parse(String panCardNumber, Locale locale) throws ParseException {

		PanCard panCardObj = new PanCard();

		if (panCardNumber.length() != 10) {

			panCardObj.setFirstAlphabeticChars("ABCDE");
			panCardObj.setNextHalfChars("12345");
		}

		panCardObj.setFirstAlphabeticChars(panCardNumber.substring(0, 4));
		panCardObj.setNextHalfChars(panCardNumber.substring(5, 9));

		return panCardObj;
	}

}
