package com.einfo.Orderlist.Repo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orderlist")
public class OrderRepo {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		private String date;
		private int total;
		private String status;
		
		@Override
		public String toString() {
			return "OrderRepo [id=" + id + ", date=" + date + ", total=" + total + ", status=" + status + "]";
		}
		
		
		public OrderRepo() {
			super();
		}
		
		
		public OrderRepo(Integer id, String date, int total, String status) {
			super();
			this.id = id;
			this.date = date;
			this.total = total;
			this.status = status;
		}

		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}


		public void save(OrderRepo order) {
			// TODO Auto-generated method stub
			
		}

		
}
