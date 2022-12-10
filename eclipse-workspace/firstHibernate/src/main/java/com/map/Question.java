package com.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Question {
	
	@Id
	private int qustion_id;
	private String name;
	private String roll;
	
	@OneToMany (mappedBy = "question")
//	@OneToMany
//	@JoinColumn(name="q_id")
//	@OrderColumn(name="type")
	private List<Answer> answer;

	public int getQustion_id() {
		return qustion_id;
	}

	public void setQustion_id(int qustion_id) {
		this.qustion_id = qustion_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}


	
	
	
	

}
