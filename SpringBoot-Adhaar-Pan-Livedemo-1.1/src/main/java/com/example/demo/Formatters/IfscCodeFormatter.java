package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import com.example.demo.DTO.IfscCode;

public class IfscCodeFormatter implements Formatter<IfscCode> {


	@Override
	public String print(IfscCode object, Locale locale) {

		return null;
	}

	@Override
	public IfscCode parse(String ifscCode, Locale locale) throws ParseException {
		
		IfscCode code=new IfscCode();

		Optional<String> checker = Optional.ofNullable(ifscCode);

		if (checker.isPresent() && StringUtils.substring(ifscCode, 0, 4).length() == 4 && ifscCode.length() == 8) {

			String bankuniqueAlpha = StringUtils.substring(ifscCode, 0, 4);

			String letters = StringUtils.substring(ifscCode, 4, ifscCode.length());
			
			System.out.println(code);

			code.setFirstFourAlphabets(bankuniqueAlpha);
			code.setSecondFourDigits(letters);

			return code;
		} else {

			code.setFirstFourAlphabets("Dummy");
			code.setSecondFourDigits("12345");

			return code;
		}

	}

}
