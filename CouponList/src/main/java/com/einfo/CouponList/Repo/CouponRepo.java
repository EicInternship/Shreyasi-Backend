package com.einfo.CouponList.Repo;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CouponList")
public class CouponRepo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int cminimum;
	private int cmaximum;
	
	public CouponRepo() {
		super();
	}

	
	public CouponRepo(int id, String name, int cminimum, int cmaximum) {
		super();
		this.id = id;
		this.name = name;
		this.cminimum = cminimum;
		this.cmaximum = cmaximum;
	}
	
	
	@Override
	public String toString() {
		return "CouponRepo [id=" + id + ", name=" + name + ", cminimum=" + cminimum + ", cmaximum=" + cmaximum + "]";
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
	public int getCminimum() {
		return cminimum;
	}
	public void setCminimum(int cminimum) {
		this.cminimum = cminimum;
	}
	public int getCmaximum() {
		return cmaximum;
	}
	public void setCmaximum(int cmaximum) {
		this.cmaximum = cmaximum;
	}

		
}
