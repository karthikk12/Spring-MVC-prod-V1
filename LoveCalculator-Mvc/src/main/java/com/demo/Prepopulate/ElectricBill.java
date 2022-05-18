package com.demo.Prepopulate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.DTO.BillNumber;
import com.demo.DTO.ElectricityDTO;

@Component
public class ElectricBill {

	@Autowired
	private BillNumber bill;

	@Autowired
	private ElectricityDTO dto;

	public void electricPrepopulate() {

		bill.setCountryCode("12");
		bill.setFirstFourNumbers("1213");
		bill.setRegionCode("23");

		dto.setBillNumber(bill);

	}

}
