package com.einfo.CouponList.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.CouponList.Model.CouponModel;
import com.einfo.CouponList.Repo.CouponRepo;



@RestController
public class CouponlistController {
	
	@Autowired
	 CouponModel or;
	
	
	@RequestMapping("/list")
	public ModelAndView gethell() {
		return new ModelAndView("CouponList");
	}
	
	@RequestMapping("/addcoupon")
	public String getData( CouponRepo repo ) {
		or.save(repo);
		return "success";
	}
	
}
