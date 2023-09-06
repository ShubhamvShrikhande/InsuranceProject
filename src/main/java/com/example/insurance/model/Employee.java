package com.example.insurance.model;


import java.util.List;
import java.util.Objects;





import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "city")
	private String city;
	@Column(name = "emilId")
	private String emilId;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Adderss> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmilId() {
		return emilId;
	}
	public void setEmilId(String emilId) {
		this.emilId = emilId;
	}
	public List<Adderss> getAddress() {
		return address;
	}
	public void setAddress(List<Adderss> address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		Integer id = null;
		id = 40;
		if(id == null) {
	
		}else {
			int hashCode = id.hashCode();
		}
		int result = 1;
		result = prime * result + ((emilId == null) ? 0 : emilId.hashCode());
		//result = prime * result + ((id == null) ? 0 : id.hashCode());
		
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
		if (emilId == null) {
			if (other.emilId != null)
				return false;
		} else if (!emilId.equals(other.emilId))
			return false;
		/*
		 * if (id == null) { if (other.id != null) { return false; } } else if
		 * (!id.equals(other.id)) { return false; }
		 */
		return true;
	}

}
