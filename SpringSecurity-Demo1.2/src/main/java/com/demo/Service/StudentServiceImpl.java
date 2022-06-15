package com.demo.Service;

import org.springframework.stereotype.Service;

import com.demo.Exceptions.NoStudentFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public String displayName(String name) {

		if (name.equals("Karthik")) {

			return name;

		} else {
			throw new NoStudentFoundException("No Studnet Found At the Name");
		}
	}

}
