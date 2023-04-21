package com.einfo.Orderlist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.Orderlist.Model.OrderModel;
import com.einfo.Orderlist.Repo.OrderRepo;


@RestController
public class OderlistController {
	
	@Autowired
	 OrderModel or;
	
	
	@RequestMapping("/")
	public ModelAndView gethell() {
		return new ModelAndView("Orderlist");
	}
	
	@RequestMapping("/success")
	public String getData( OrderRepo repo1 ) {
		or.save(repo1);
		return "success";
	}
	
}
