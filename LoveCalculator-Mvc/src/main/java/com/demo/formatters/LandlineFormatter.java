package com.demo.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.demo.DTO.Landline;

public class LandlineFormatter implements Formatter<Landline> {

	@Override
	public String print(Landline object, Locale locale) {
		return null;
	}

	@Override
	public Landline parse(String landLinetext, Locale locale) throws ParseException {

		Landline ln = new Landline();

		String[] arr = landLinetext.split("-");

		ln.setAreaCode(arr[0]);
		ln.setNumbers(arr[1]);
		ln.setRegionCode(arr[2]);

		return ln;
	}

}
