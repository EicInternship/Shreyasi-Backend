package com.einfo.orderdetails.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DetailDao {

	@Id
	private String createdAt;
	private String name;
	private String email;
	private String contact;
	private String DeliveryAdd;
	private String BillingAdd;
	private int subtotal;
	private String shipping;
	private int tax;
	private int total;
	private String sellerGst;
	private String purchaseGst;
	
	@Override
	public String toString() {
		return "DetailDao [createdAt=" + createdAt + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", DeliveryAdd=" + DeliveryAdd + ", BillingAdd=" + BillingAdd + ", subtotal=" + subtotal
				+ ", shipping=" + shipping + ", tax=" + tax + ", total=" + total + ", sellerGst=" + sellerGst
				+ ", purchaseGst=" + purchaseGst + "]";
	}

	
	public DetailDao() {
		super();
	}
	
	
	public DetailDao(String createdAt, String name, String email, String contact, String deliveryAdd, String billingAdd,
			int subtotal, String shipping, int tax, int total, String sellerGst, String purchaseGst) {
		super();
		this.createdAt = createdAt;
		this.name = name;
		this.email = email;
		this.contact = contact;
		DeliveryAdd = deliveryAdd;
		BillingAdd = billingAdd;
		this.subtotal = subtotal;
		this.shipping = shipping;
		this.tax = tax;
		this.total = total;
		this.sellerGst = sellerGst;
		this.purchaseGst = purchaseGst;
	}

	
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDeliveryAdd() {
		return DeliveryAdd;
	}
	public void setDeliveryAdd(String deliveryAdd) {
		DeliveryAdd = deliveryAdd;
	}
	public String getBillingAdd() {
		return BillingAdd;
	}
	public void setBillingAdd(String billingAdd) {
		BillingAdd = billingAdd;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getSellerGst() {
		return sellerGst;
	}
	public void setSellerGst(String sellerGst) {
		this.sellerGst = sellerGst;
	}
	public String getPurchaseGst() {
		return purchaseGst;
	}
	public void setPurchaseGst(String purchaseGst) {
		this.purchaseGst = purchaseGst;
	}

	
}
