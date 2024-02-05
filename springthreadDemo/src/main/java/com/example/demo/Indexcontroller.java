package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Indexcontroller {
	@Autowired
	StudentDAO studentdao;
	 
	 	@RequestMapping("show")
	 	public ModelAndView Index(@RequestParam("name") String st) {
        ModelAndView mv = new ModelAndView();
	    mv.addObject("username",st);
	    mv.setViewName("welcom.jsp");
	     return mv;
	}
@RequestMapping("addStudent")
	public ModelAndView Adduser(Student stud) {
		System.out.println(stud.getRollNo());
		System.out.println(stud.getStudentName());
		ModelAndView mv = new ModelAndView();
		mv.addObject("StudentDetails",stud);
			mv.setViewName("added.jsp");
			studentdao.save(stud);
			return mv;
		}

	@RequestMapping("viewStudent")
	 public ModelAndView display(Student stud) {
	Optional <Student>op=studentdao.findById(stud.getRollNo());
	Student student =op.get();
	ModelAndView mv = new ModelAndView();
	mv.addObject("StudentDetails",student);
		mv.setViewName("display.jsp");
		
		return mv;
		 
         }
	@RequestMapping("deleteStudent")
	 public ModelAndView deleteuser(Student stud) {
	ModelAndView mv = new ModelAndView();
	studentdao.deleteById(stud.getRollNo());
	mv.addObject("StudentDetails",stud);
		mv.setViewName("delete.jsp");
		
		return mv;
	}
	@RequestMapping("updateStudent")
	 public ModelAndView updateuser(Student stud) {
	ModelAndView mv = new ModelAndView();
	studentdao.findById(stud.getRollNo());
	studentdao.deleteById(stud.getRollNo());
	mv.addObject("StudentDetails",stud);
		mv.setViewName("update.jsp");
		
		return mv;
	}
	
	
}