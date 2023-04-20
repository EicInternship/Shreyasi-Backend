package com.einfo.orderdetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.orderdetails.Model.DetailDao;
import com.einfo.orderdetails.Repo.DetailRepo;

@Controller
public class OrderController {
	
	@Autowired
	DetailRepo dr;
	
	@RequestMapping("/")
	public ModelAndView gethell() {
		return new ModelAndView("detail");
	}
	
	@RequestMapping("savedata")
	public ModelAndView savedata(DetailDao dd) {
		dr.save(dd);
		return new ModelAndView("detail");
	}
}
