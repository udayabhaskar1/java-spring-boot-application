package nus.iss.test.CAproject.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Leave_record {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="start_date")
	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "DD-MM-YYYY")
	private Date start_date;
	@Column(name="end_date")
	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "DD-MM-YYYY")
	private Date end_date;
	@Column(name="type")
	private String type;
	@Column(name="reason")
	private String reason;
	@Column(name="remark")
	private String remark;
	
	@Column(name = "cover_employeeid")
	private int employee;
	@Column(name="contact")
	private String contact;
	@Column(name="status")
	private String status;
	@Column(name="mgr_comment")
	private String mgr_comment;
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employees;
	public Leave_record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave_record(Date start_date, Date end_date, String type, String reason, String remark, int employee,
			String contact, String status, String mgr_comment,Employee e) {
		super();
		this.start_date = start_date;
		this.end_date = end_date;
		this.type = type;
		this.reason = reason;
		this.remark = remark;
		this.employee = employee;
		this.contact = contact;
		this.status = status;
		this.mgr_comment = mgr_comment;
		this.employees=e;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMgr_comment() {
		return mgr_comment;
	}
	public void setMgr_comment(String mgr_comment) {
		this.mgr_comment = mgr_comment;
	}
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	
	
}
