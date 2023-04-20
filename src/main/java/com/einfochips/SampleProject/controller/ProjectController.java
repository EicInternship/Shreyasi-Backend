package com.einfochips.SampleProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.SampleProject.Model.Product;
import com.einfochips.SampleProject.Repo.ProductRepo;

@RestController
public class ProjectController {
	
	@Autowired
	ProductRepo pr;
	
	@RequestMapping("hello")
	public String getdata()
	{
		return "Hello All";
	}
	
	@RequestMapping("Addcart")
	public ModelAndView getcart() {
		return new ModelAndView("Addcart");
		
	}
	
	@RequestMapping("Shipment")
	public ModelAndView getshipment() {
	return new ModelAndView("Shipment");
	}
	
	@RequestMapping("Product")
	public ModelAndView getproduct() {
		ModelAndView mv = new ModelAndView("Product");//product.jsp
		List<Product> list = pr.findAll();//product.java
		mv.addObject("Product",list);// adds data to table
		return mv;	
	}
	
	

	@RequestMapping("adddata")
	public ModelAndView adddata() {
	Product pt =new Product(12,"Phone",50000,5);//product java
//	System.out.println(pt);
	pr.save(pt);
	return new ModelAndView("Product");
	}
	
	@RequestMapping("addProduct")
	public ModelAndView cart(Integer id) {
		System.out.println(id);
		ModelAndView mv3 = new ModelAndView("Addcart");
		Optional<Product> ls=pr.findById(id);
		System.out.println(ls);
		//Product li = pr.getById(id);
		//mv3.addObject("Addcart",ls);
		mv3.addObject(ls);
		return mv3;
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(@RequestParam("pid") int id) {
		pr.deleteById((id));
		return new ModelAndView("delete");
	}
	
	
	@RequestMapping("deletejsp")
	public ModelAndView deletejsp() {
		return new ModelAndView("delete");
	}
	
}
