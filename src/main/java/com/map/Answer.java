package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerID;
	private String answer;
	
	
	public int getAnswerID() {
		return answerID;
	}
	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerID, String answer) {
		super();
		this.answerID = answerID;
		this.answer = answer;
	}
	
	
	
	
}
	
	


