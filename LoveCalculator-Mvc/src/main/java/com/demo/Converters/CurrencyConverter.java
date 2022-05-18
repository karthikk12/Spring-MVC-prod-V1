package com.demo.Converters;

import java.util.Currency;

import org.springframework.core.convert.converter.Converter;

public class CurrencyConverter implements Converter<String, Currency> {

	@Override
	public Currency convert(String source) {

		String value = source.toUpperCase();

		Currency currency = Currency.getInstance(value);

		return currency;
	}

}
