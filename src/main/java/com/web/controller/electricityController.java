package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.model.electricity;

import com.web.service.electricityServiceImp;

@Controller
public class electricityController {
	@Autowired
	private electricityServiceImp service;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "home";
	}
	@RequestMapping("/consumerbill")
	public String displayBillForm()
	{
		return "consumerbill";
	}
	@RequestMapping("/save")
	public String displayStudentForm(electricity electricity,ModelMap model)
	{
		service.saveElectricity(electricity);
	return "success";
	}
	@RequestMapping("/viewAllconsumers")
	public String displayAllConsumers(ModelMap model)
	{
		model.put("electricity", service.getAllElectricity());
		return "viewallbill";
	}
	@RequestMapping("/deleteUrl/{consumerid}")
	public String delete(@PathVariable int consumerid,ModelMap model)
	{
		service.deleteElectricity(consumerid);
		return "redirect:/viewAllconsumers";
	}
	@RequestMapping(value="/editUrl/{consumerid}", method=RequestMethod.GET)
	public String editUser(@PathVariable int consumerid,ModelMap model)
	{
		model.put("command", service.getOneElectricity(consumerid));
		return "edit";
	}
	@RequestMapping(path="/editandsave",method=RequestMethod.GET)
	public String editUserAndSave(electricity electricity,ModelMap model)
	{
		service.saveElectricity(electricity);
		return "redirect:/viewAllconsumers";
	}


		

}
