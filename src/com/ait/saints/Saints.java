package com.ait.saints;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Saints {

	 private int id;

	 private String name;

	 private String country;

	 private String city;
	    
	 private int century;
	    
	 private String picture;

	 private String description;
	 
	 public Saints() {
		 
	 }
	 
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCentury() {
		return century;
	}

	public void setCentury(int century) {
		this.century = century;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}

		
