package com.einfo.Orderlist.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfo.Orderlist.Repo.OrderRepo;

@Repository
public interface OrderModel extends JpaRepository<OrderRepo, Integer>{
		
}
