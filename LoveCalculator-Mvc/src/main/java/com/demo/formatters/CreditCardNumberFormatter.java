package com.demo.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import com.demo.DTO.CreditNumberDetails;

public class CreditCardNumberFormatter implements Formatter<CreditNumberDetails> {

	@Override
	public String print(CreditNumberDetails object, Locale locale) {
		return null;
	}

	@Override
	public CreditNumberDetails parse(String cardNumber, Locale locale) throws ParseException {

		CreditNumberDetails cardDetails = new CreditNumberDetails();

		System.out.println("Credit card number parse");

		String arr[] = cardNumber.split("-");

		cardDetails.setFirstTwoNumbers(arr[0]);
		cardDetails.setSecondTwoNumbers(arr[1]);
		cardDetails.setLastTwoNumbers(arr[2]);

		System.out.println(cardDetails);

		return cardDetails;
	}

}
