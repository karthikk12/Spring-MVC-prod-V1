package com.demo.Converters;

import org.springframework.core.convert.converter.Converter;

public class EmailConverter implements Converter<String, String> {

	@Override
	public String convert(String source) {

		return source.toUpperCase();
	}

}
