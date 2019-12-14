package com.bw.pojo;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class City {
	private Long id;
	private String name;
	private int pop;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String coname;
	private Long cid;
	public City(String name, int pop, Date birthday, Long cid) {
		this.name = name;
		this.pop = pop;
		this.birthday = birthday;
		this.cid = cid;
	}
	public City() {
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
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", pop=" + pop + ", birthday=" + birthday + ", coname=" + coname
				+ "]";
	}
}
