package com.almabetter.samplewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class DefaultController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String welcome() {
		return "Welcome to AlmaBetter!";
	}
}
