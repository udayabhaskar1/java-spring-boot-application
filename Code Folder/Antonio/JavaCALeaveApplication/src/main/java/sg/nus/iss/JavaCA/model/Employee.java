package sg.nus.iss.JavaCA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="employee_details")
@SequenceGenerator(name="seq", initialValue=1)
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id;
	@NotEmpty(message = "Username cannot be empty")
	@Size(min=3, max=10 ,message="Username must be between 3 and 10 characters")
	private String username;
	@NotEmpty(message = "Password cannot be empty")
	@Size(min=3, max=15,message="Password must be between 3 and 15 characters")
	private String password;
	private String role;
	@NotEmpty (message ="First Name cannot be empty")
	private String firstname;
	@NotEmpty (message ="Last Name cannot be empty")
	private String lastname;
//	@Column(name="managerId")
//	private int managerid;
	@Min(value = 0, message = "Annual leave should not be less than zero")
	@Max(value = 18, message = "Annual leave should not be more than 18 days")
	@Column(name="annual_leave_entitled")
	private int	annualleaveentitlement;
	@Column(name="annual_leave_bal")
	private int annualleavebalance;
	@Min(value = 0,  message = "Medical leave should not be less than zero")
	@Max(value = 60,  message = "Medical leave should not be more than 60 days")
	@Column(name="medical_leave_entitled")
	private int medicalleaveentitlement;
	@Column(name="medical_leave_bal")
	private int medicalleavebalance;
	
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public int getAnnualleaveentitlement() {
		return annualleaveentitlement;
	}
	public void setAnnualleaveentitlement(int annualleaveentitlement) {
		this.annualleaveentitlement = annualleaveentitlement;
	}
	public int getAnnualleavebalance() {
		return annualleavebalance;
	}
	public void setAnnualleavebalance(int annualleavebalance) {
		this.annualleavebalance = annualleavebalance;
	}
	public int getMedicalleaveentitlement() {
		return medicalleaveentitlement;
	}
	public void setMedicalleaveentitlement(int medicalleaveentitlement) {
		this.medicalleaveentitlement = medicalleaveentitlement;
	}
	public int getMedicalleavebalance() {
		return medicalleavebalance;
	}
	public void setMedicalleavebalance(int medicalleavebalance) {
		this.medicalleavebalance = medicalleavebalance;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public int getManagerid() {
//		return managerid;
//	}
//	public void setManagerid(int managerid) {
//		this.managerid = managerid;
//	}
//	
	public Employee(@NotEmpty(message = "Role cannot be empty") @Size(min = 3, max = 15) String username,
			@Size(min = 3, max = 15) String password, String role, @NotEmpty String firstname,
			@NotEmpty String lastname,
			@Min(value = 0, message = "Annual leave should not be less than zero") @Max(value = 18, message = "Annual leave should not be more than 18 days") int annualleaveentitlement,
			int annualleavebalance,
			@Min(value = 0, message = "Medical leave should not be less than zero") @Max(value = 60, message = "Medical leave should not be more than 60 days") int medicalleaveentitlement,
			int medicalleavebalance) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.firstname = firstname;
		this.lastname = lastname;
		this.annualleaveentitlement = annualleaveentitlement;
		this.annualleavebalance = annualleavebalance;
		this.medicalleaveentitlement = medicalleaveentitlement;
		this.medicalleavebalance = medicalleavebalance;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", annualleaveentitlement="
				+ annualleaveentitlement + ", annualleavebalance=" + annualleavebalance + ", medicalleaveentitlement="
				+ medicalleaveentitlement + ", medicalleavebalance=" + medicalleavebalance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annualleavebalance;
		result = prime * result + annualleaveentitlement;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + medicalleavebalance;
		result = prime * result + medicalleaveentitlement;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Employee other = (Employee) obj;
		if (annualleavebalance != other.annualleavebalance)
			return false;
		if (annualleaveentitlement != other.annualleaveentitlement)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (medicalleavebalance != other.medicalleavebalance)
			return false;
		if (medicalleaveentitlement != other.medicalleaveentitlement)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	





	
	
	

	
}

