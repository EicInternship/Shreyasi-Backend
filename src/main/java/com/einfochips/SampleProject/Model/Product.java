package com.einfochips.SampleProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  //jpa dependency
public class Product {

		@Id
		private int id;
		private String name;
		private int amount;
		private int quantity;
		
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", amount=" + amount + ", quantity=" + quantity + "]";
		}

		
		public Product() {
			super();
		}

		
		public Product(int id, String name, int amount, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.amount = amount;
			this.quantity = quantity;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		
}
