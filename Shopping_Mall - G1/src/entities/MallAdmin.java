package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MallAdmin")
public class MallAdmin implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="adminId")
	private int id;
	@Column(name="adminName")
	private String name;
	@Column(name="Password")
	private String password;
	@Column(name="Mall")
	private Mall mall;
	@Column(name="Phone")
	private String phone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private MallAdmin malladmin;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Mall mall1;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Mall getMall() {
		return mall;
	}
	public void setMall(Mall mall) {
		this.mall = mall;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + "]";
	}
	
}
