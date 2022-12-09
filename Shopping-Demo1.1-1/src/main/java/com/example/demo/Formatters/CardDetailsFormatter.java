package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.DTO.CardDetails;

public class CardDetailsFormatter implements Formatter<CardDetails> {

	@Override
	public String print(CardDetails object, Locale locale) {
		return null;
	}

	@Override
	public CardDetails parse(String cardNumber, Locale locale) throws ParseException {

		CardDetails details = new CardDetails();

		if (cardNumber.length() > 16 || cardNumber.length() == 0) {

			details.setFirstFourDigits("0000");
			details.setMiddleFourDigits("1111");
			details.setLastFourDigits("2222");

		}

		details.setFirstFourDigits("0000");
		details.setMiddleFourDigits("1111");
		details.setLastFourDigits("2222");

		return details;
	}

}
