package com.springmvc.app.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.app.beans.Student;
@Controller
public class StudentController {
	
	ArrayList<Student> al=new ArrayList<Student>();
	
	@RequestMapping(method=RequestMethod.GET)
	public String getStudentForm(){
		System.out.println("-------------------------------------");
		return "StudentForm";
	}
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String saveStudentForm(@ModelAttribute(name="student") Student st,Model model){
		
		st.setSid(st.getSid()==null?1:st.getSid()+1);
		System.out.println(st);
		model.addAttribute("student", st);
		model.addAttribute("list", al);
		al.add(st);
		return "StudentForm";
	}
}
