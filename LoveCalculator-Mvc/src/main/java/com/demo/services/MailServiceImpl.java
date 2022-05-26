package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailSend {

	@Autowired
	private JavaMailSender sender;

	@Override
	public void sendMail(String userName, String emailId, String message) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setTo(emailId);
		mailMessage.setSubject("Test");
		mailMessage.setText(message);

		sender.send(mailMessage);

	}

}
