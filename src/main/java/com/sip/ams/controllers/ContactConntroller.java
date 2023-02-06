package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactConntroller {
	
	@RequestMapping("/details")
	public String details() {
		return "info_contact.html";
	}
}
