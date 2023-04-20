package com.einfo.Orderlist.Repo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orderlist")
public class OrderRepo {

		@Id
		private int id;
		@Override
		public String toString() {
			return "OrderRepo [id=" + id + ", date=" + date + ", total=" + total + ", status=" + status + "]";
		}
		private Date date;
		private int total;
		private String status;
		
		public OrderRepo() {
			super();
		}
		
		
		public OrderRepo(int id, Date date, int total, String status) {
			super();
			this.id = id;
			this.date = date;
			this.total = total;
			this.status = status;
		}

		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
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
