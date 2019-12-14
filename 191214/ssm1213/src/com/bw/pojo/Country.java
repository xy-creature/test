package com.bw.pojo;

public class Country {
	private Long id;
	private String name;
	private String citynames;
	public String getCitynames() {
		return citynames;
	}
	public void setCitynames(String citynames) {
		this.citynames = citynames;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
}
