package com.einfochips.SampleProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfochips.SampleProject.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
