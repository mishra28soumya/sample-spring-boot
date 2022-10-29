package com.almabetter.samplewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/document")
public class DocumentController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String document() {
		return "This is a document.";
	}
}
