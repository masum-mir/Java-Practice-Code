package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OneToOneM {
	
	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private int id;
	private String name;
	private String dept;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private OneToOneMap oneToMap;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public OneToOneMap getOneToMap() {
		return oneToMap;
	}

	public void setOneToMap(OneToOneMap oneToMap) {
		this.oneToMap = oneToMap;
	}

	public OneToOneM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OneToOneM(int id, String name, String dept, OneToOneMap oneToMap) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.oneToMap = oneToMap;
	}
	
	

}
