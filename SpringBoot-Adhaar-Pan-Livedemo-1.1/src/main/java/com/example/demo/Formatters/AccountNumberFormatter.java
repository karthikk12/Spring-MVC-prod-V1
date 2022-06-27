package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import com.example.demo.DTO.AccountNumber;

public class AccountNumberFormatter implements Formatter<AccountNumber> {

	@Override
	public String print(AccountNumber object, Locale locale) {
		return null;
	}

	@Override
	public AccountNumber parse(String accNumber, Locale locale) throws ParseException {

		AccountNumber accountnumber = new AccountNumber();

		Optional<String> checker = Optional.ofNullable(accNumber);

		if (checker.isPresent() && accNumber.length() == 16) {

			String first = StringUtils.substring(accNumber, 0, 4);
			String second = StringUtils.substring(accNumber, 4, 8);
			String third = StringUtils.substring(accNumber, 8, 12);
			String fourth = StringUtils.substring(accNumber, 12, 16);

			accountnumber.setFirstFourDigit(first);
			accountnumber.setSecondFourDigit(second);
			accountnumber.setThirdFourDigit(third);
			accountnumber.setFourthFourDigit(fourth);

			return accountnumber;

		}

		else {

			accountnumber.setFirstFourDigit("1234");
			accountnumber.setSecondFourDigit("5678");
			accountnumber.setThirdFourDigit("1246");
			accountnumber.setFourthFourDigit("7878");

			return accountnumber;
		}
	}

}
