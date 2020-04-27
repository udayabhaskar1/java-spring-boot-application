package sg.nus.iss.JavaCA.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PublicHoliday {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="holidayid")
	private int id;
	private String holidayname;
	@Basic
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date holidaydate;
	public PublicHoliday() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PublicHoliday(int id, String holidayname, Date holidaydate) {
		super();
		this.id = id;
		this.holidayname = holidayname;
		this.holidaydate = holidaydate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHolidayname() {
		return holidayname;
	}
	
	public void setHolidayname(String holidayname) {
		this.holidayname = holidayname;
	}
	public Date getHolidaydate() {
		return holidaydate;
	}
	public void setHolidaydate(Date holidaydate) {
		this.holidaydate = holidaydate;
	}
	
	@Override
	public String toString() {
		return "PublicHoliday [id=" + id + ", holidayname=" + holidayname + ", holidaydate=" + holidaydate + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((holidaydate == null) ? 0 : holidaydate.hashCode());
		result = prime * result + ((holidayname == null) ? 0 : holidayname.hashCode());
		result = prime * result + id;
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
		PublicHoliday other = (PublicHoliday) obj;
		if (holidaydate == null) {
			if (other.holidaydate != null)
				return false;
		} else if (!holidaydate.equals(other.holidaydate))
			return false;
		if (holidayname == null) {
			if (other.holidayname != null)
				return false;
		} else if (!holidayname.equals(other.holidayname))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
