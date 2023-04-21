package com.einfo.CouponList.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfo.CouponList.Repo.CouponRepo;


@Repository
public interface CouponModel extends JpaRepository<CouponRepo, Integer>{
		
}
