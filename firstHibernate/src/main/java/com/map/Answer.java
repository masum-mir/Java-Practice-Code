package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	private int answer_id;
	private String nameAns;
	private String rollAns;
	
	@ManyToOne
	private Question question;
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getNameAns() {
		return nameAns;
	}
	public void setNameAns(String nameAns) {
		this.nameAns = nameAns;
	}
	public String getRollAns() {
		return rollAns;
	}
	public void setRollAns(String rollAns) {
		this.rollAns = rollAns;
	}
	
	

}
