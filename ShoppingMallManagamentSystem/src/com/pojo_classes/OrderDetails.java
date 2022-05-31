package com.pojo_classes;


import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Mall")

public class OrderDetails 
{
@Id
private int ID;
private LocalDateTime dateOfPurchase;
private float total;
private Customer customer_id;
private String paymentMode;
private Shop shop_id;
public int ID()
{
	return ID;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public LocalDateTime getDateOfPurchase() {
	return dateOfPurchase;
}
public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
	this.dateOfPurchase = dateOfPurchase;
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
public Customer getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(Customer customer_id) {
	this.customer_id = customer_id;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
public Shop getShop_id() {
	return shop_id;
}
public void setShop_id(Shop shop_id) {
	this.shop_id = shop_id;
}
