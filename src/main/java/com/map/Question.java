package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "Question_Id")
	private int QuestionID;
	private String Question;
	
	@OneToOne
	private Answer answer;
	
	
	public int getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	//constructor using fields
	public Question(int questionID, String question, Answer answer) {
		super();
		QuestionID = questionID;
		Question = question;
		this.answer = answer;
	}
	 //constructor using super class
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
