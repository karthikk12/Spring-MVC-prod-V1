package com.demo.formatters;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.demo.DTO.CreditBalance;

public class CreditCardBalanceFromatter implements Formatter<CreditBalance> {

	@Override
	public String print(CreditBalance object, Locale locale) {
		return null;
	}

	@Override
	public CreditBalance parse(String balance, Locale locale) throws ParseException {

		CreditBalance creditBalance = new CreditBalance();

		String arr[] = balance.split(" ");

		Currency GERMANY = Currency.getInstance(Locale.GERMANY);

		creditBalance.setAmount(new BigDecimal(arr[0]));
		creditBalance.setMoneyCode(GERMANY.getSymbol());

		return creditBalance;
	}

}
