package nus.iss.test.CAproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="role")
	private String role;
	@Column(name="annual_leave_entitled")
	private int annual_leave_entitled;
	@Column(name="annual_leave_bal")
	private int annual_leave_bal;
	@Column(name="medical_leave_entitled")
	private int medical_leave_entitled;
	@Column(name="medical_leave_bal")
	private int medical_leave_bal;
	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Leave_record> list=new ArrayList<Leave_record>();
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String username, String password, String firstname, String lastname, String role,
			int annual_leave_entitled, int annual_leave_bal, int medical_leave_entitled, int medical_leave_bal) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		this.annual_leave_entitled = annual_leave_entitled;
		this.annual_leave_bal = annual_leave_bal;
		this.medical_leave_entitled = medical_leave_entitled;
		this.medical_leave_bal = medical_leave_bal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAnnual_leave_entitled() {
		return annual_leave_entitled;
	}
	public void setAnnual_leave_entitled(int annual_leave_entitled) {
		this.annual_leave_entitled = annual_leave_entitled;
	}
	public int getAnnual_leave_bal() {
		return annual_leave_bal;
	}
	public void setAnnual_leave_bal(int annual_leave_bal) {
		this.annual_leave_bal = annual_leave_bal;
	}
	public int getMedical_leave_entitled() {
		return medical_leave_entitled;
	}
	public void setMedical_leave_entitled(int medical_leave_entitled) {
		this.medical_leave_entitled = medical_leave_entitled;
	}
	public int getMedical_leave_bal() {
		return medical_leave_bal;
	}
	public void setMedical_leave_bal(int medical_leave_bal) {
		this.medical_leave_bal = medical_leave_bal;
	}
	
}
