package com.pojo_classes;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Mall")

public class Employee 
{
@Id
private int ID;
private String Name;
private LocalDate dob;
private float salary;
private String address;
private String designation;
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
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Shop getShop_id() {
	return shop_id;
}
public void setShop_id(Shop shop_id) {
	this.shop_id = shop_id;
}

}