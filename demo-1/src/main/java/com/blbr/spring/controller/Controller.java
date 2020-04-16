package com.blbr.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blbr.spring.beans.Demo1Application;
import com.blbr.spring.beans.Mybeans;

@org.springframework.stereotype.Controller
@Scope("request")
public class Controller {

	private Mybeans myBean;

	private Demo1Application myAnnotatedBean;

	@Autowired
	public void setMyBean(Mybeans myBean) {
		this.myBean = myBean;
	}

	@Autowired
	public void setMyAnnotatedBean(Demo1Application obj) {
		this.myAnnotatedBean = obj;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("MyBean hashcode=" + myBean.hashCode());
		System.out.println("MyAnnotatedBean hashcode=" + myAnnotatedBean.hashCode());

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
}
