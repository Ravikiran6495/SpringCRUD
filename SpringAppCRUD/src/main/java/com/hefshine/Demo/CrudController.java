package com.hefshine.Demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrudController {
	
	
	@Autowired
	StudentRepo studentrepo;
	
	
	@RequestMapping("home")
	public String process(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String processform(@ModelAttribute Student student, Model model)
	{
	
		studentrepo.save(student);

		List<Student> ll = studentrepo.findAll();
		model.addAttribute("studentlist",ll);
		return "welcome.jsp";
	}
	
	@RequestMapping("/")
	public String AllData(Model model)
	{
		List<Student> ll = studentrepo.findAll();
		model.addAttribute("studentlist",ll);
		return "welcome.jsp";
	}
	
	
	@RequestMapping("delete/{id}")
	public String DeleteData(@PathVariable int id)
	{
		studentrepo.deleteById(id);
		
		return "redirect:/";
	}
	
	
	
	@RequestMapping("{id}")
	public String Update(@PathVariable int id, Model model)
	{
		Student student = studentrepo.getOne(id);
		
		model.addAttribute("student", student);
		return "edit.jsp";
	}

}
