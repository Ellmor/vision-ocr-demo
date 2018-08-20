package com.piotrsuski.vision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {
	@RequestMapping(value = { "/" })
	public String index(Model model) {
		return "index";
	}
}
