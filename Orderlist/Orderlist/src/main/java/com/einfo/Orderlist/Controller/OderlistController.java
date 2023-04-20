package com.einfo.Orderlist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.Orderlist.Repo.OrderRepo;



@RestController
public class OderlistController {
	
	@Autowired
	 private OrderRepo or;
	
	@PostMapping("orderlist")
	public ModelAndView gethell() {
		return new ModelAndView("Orderlist");
	}
	
	@PostMapping("savedata")
	@ResponseBody
	public String savedata(OrderRepo order) {
		or.save(order);
		return "success";
	}
	
	
}
