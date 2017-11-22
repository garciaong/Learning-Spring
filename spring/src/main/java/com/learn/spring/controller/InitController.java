package com.learn.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class InitController {
	
	private static final Logger log = Logger.getLogger(InitController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String landing(Model model) {System.out.println("###Can???");
		log.info("###Landing....");
		model.addAttribute("message", "Hello world!");
		
		return "init";
	}
}
