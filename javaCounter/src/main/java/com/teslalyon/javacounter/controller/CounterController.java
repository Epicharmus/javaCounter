package com.teslalyon.javacounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public RedirectView main(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.getAttribute("count");
			int sessionCount = (int)session.getAttribute("count");
			sessionCount += 1;
			session.setAttribute("count", sessionCount);
		}
		return new RedirectView("/sessioncount");
	}
	@RequestMapping("/addone")
	public RedirectView addOne(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.getAttribute("count");
			int sessionCount = (int)session.getAttribute("count");
			sessionCount += 1;
			session.setAttribute("count", sessionCount);
		}
		return new RedirectView("/sessioncount");
	}
	@RequestMapping("/addtwo")
	public RedirectView addTwo(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.getAttribute("count");
			int sessionCount = (int)session.getAttribute("count");
			sessionCount += 2;
			session.setAttribute("count", sessionCount);
		}
		return new RedirectView("/sessioncount");
	}
	@RequestMapping("/sessioncount")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			int sessionCount = (int)session.getAttribute("count");
			model.addAttribute("count", sessionCount);
			System.out.println("count is " + session.getAttribute("count"));
		}
		return "index.jsp";
	}
	@RequestMapping("/reset")
	public RedirectView reset(HttpSession session, Model model) {
		if (session.getAttribute("count") != null) {
			session.setAttribute("count", 0);
		}
		return new RedirectView("/sessioncount");
	}
}
