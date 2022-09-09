package com.spring.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class PageController {
	@GetMapping("/index")
	public String indexa(Model model) {
		model.addAttribute("name", "老六");
		return "index";
	}
}
