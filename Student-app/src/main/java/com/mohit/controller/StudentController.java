package com.mohit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mohit.dao.StudentDAO;


@Controller
public class StudentController {
  
	@Autowired
	StudentDAO studentDao;
	
	@RequestMapping(method = RequestMethod.GET, path = "/get-student")
	public String getStudents(Model model) {

		model.addAttribute("STUDENTS",studentDao.getStudents());
		return "list-student";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/go-home")
	public String TakeMeHome() {		
		return "home";
	}
}