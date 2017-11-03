package com.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.www.service.MessageService;

@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	@RequestMapping(value="/")
	public String findMsg(Model model) {
		String mString = messageService.findMsg(1);
		model.addAttribute("msg", mString);
		return "home";
	}
}
