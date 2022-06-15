package com.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.Dto.SignUpDto;

@Repository
public class SignUpDaoImpl implements SignUpDao {

	public SignUpDaoImpl() {
		System.out.println("SignUp Dao Object Created");
	}

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void addUser(SignUpDto signDto) {

		jdbc.update("insert into users values(?,?,?)", signDto.getUserName(), signDto.getPassword(), "1");
		jdbc.update("insert into authorities values(?,?)", signDto.getUserName(), "USER");
	}

}
