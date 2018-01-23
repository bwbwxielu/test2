package com.br.xx.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.xx.bean.Role;
import com.br.xx.service.IRoleService;

@Controller
public class RoleController {
	@Resource
	private IRoleService service;
	@RequestMapping("/list")
	public String list(String lname,HttpSession session,Model model) {
		if(lname!=null) session.setAttribute("lname", lname);
		lname=(String) session.getAttribute("lname");
		model.addAttribute(this.service.list(lname));
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute(new Role());
		return "add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Role role,Model model) {
		if(this.service.adds(role)==1) {
			return "redirect:/list";
		}else {
			model.addAttribute("mess", "添加失败！");
			return "/list";
		}		
	}
	
	@RequestMapping("{id}/del")
	public String del(@PathVariable("id")int id,Model model) {
		if( this.service.del(id)>=1){			
     		 return "redirect:/list";
      	 }else{
    		 model.addAttribute("mess", "删除失败！");
     		 return "list";
    	 }
	}
	
	@RequestMapping("{id}/update")
	public String update(@PathVariable("id")int id,Model model) {
		//model.addAttribute(new Role());
		model.addAttribute(this.service.updateById(id));
		return "update";
	}
	
	@RequestMapping(value="{id}/update",method=RequestMethod.POST)
	public String update(@PathVariable("id")int id,Model model,HttpSession session) {
		if(this.service.update(id)>=1) {
			return "redirect:/list";
		}else {
			model.addAttribute("mess", "修改失败");
			return "update";
		}		
	}
}

