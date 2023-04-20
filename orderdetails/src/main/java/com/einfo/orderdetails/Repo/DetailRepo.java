package com.einfo.orderdetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfo.orderdetails.Model.DetailDao;

@Repository
public interface DetailRepo extends JpaRepository<DetailDao, String>{

}
