package com.csmpl.meailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.csmpl.meailsender.service.EmailSenderService;

@SpringBootApplication
public class JavaEmailSenderApplication {
	
	@Autowired
	private EmailSenderService emailSenderService;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaEmailSenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {
		emailSenderService.sendMail("bikash.pattnaik14@gmail.com", "This is subject", "This is body of email");
	}

}
