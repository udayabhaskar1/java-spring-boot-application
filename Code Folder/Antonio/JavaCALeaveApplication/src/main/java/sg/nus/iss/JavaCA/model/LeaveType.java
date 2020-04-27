package sg.nus.iss.JavaCA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="leave_type")
public class LeaveType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String role;
	private int annualleavedays;
	private int medicalleavedays;
	
	
	public LeaveType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LeaveType(String role, int annualleavedays, int medicalleavedays) {
		super();
		this.role = role;
		this.annualleavedays = annualleavedays;
		this.medicalleavedays = medicalleavedays;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getAnnualleavedays() {
		return annualleavedays;
	}
	
	public void setAnnualleavedays(int annualleavedays) {
		this.annualleavedays = annualleavedays;
	}
	public int getMedicalleavedays() {
		return medicalleavedays;
	}
	public void setMedicalleavedays(int medicalleavedays) {
		this.medicalleavedays = medicalleavedays;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annualleavedays;
		result = prime * result + id;
		result = prime * result + medicalleavedays;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeaveType other = (LeaveType) obj;
		if (annualleavedays != other.annualleavedays)
			return false;
		if (id != other.id)
			return false;
		if (medicalleavedays != other.medicalleavedays)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LeaveType [id=" + id + ", role=" + role + ", annualleavedays=" + annualleavedays + ", medicalleavedays="
				+ medicalleavedays + "]";
	}
	
	
	

}
