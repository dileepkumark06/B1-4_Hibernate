package com.git.association1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee2")
public class Employee implements Serializable
{
	private static final long serialVersionUID=1l;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	@ManyToOne(cascade=CascadeType)
}
