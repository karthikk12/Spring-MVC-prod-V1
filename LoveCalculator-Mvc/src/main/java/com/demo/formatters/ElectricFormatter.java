package com.demo.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.demo.DTO.BillNumber;

public class ElectricFormatter implements Formatter<BillNumber> {

	@Override
	public String print(BillNumber object, Locale locale) {

		System.out.println(object);

		return object.getCountryCode() + "-" + object.getFirstFourNumbers() + "-" + object.getRegionCode();
	}

	@Override
	public BillNumber parse(String billNo, Locale locale) throws ParseException {

		BillNumber number = new BillNumber();

		String arr[] = billNo.split("-");

		number.setCountryCode(arr[0]);
		number.setFirstFourNumbers(arr[1]);
		number.setRegionCode(arr[2]);

		return number;
	}

}
