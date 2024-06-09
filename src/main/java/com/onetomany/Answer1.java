package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
	@Id
private int aid;
private String answers;

@ManyToOne
private Question1 ques;

public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getAnswers() {
	return answers;
}

public void setAnswers(String answers) {
	this.answers = answers;
}

public Question1 getQues() {
	return ques;
}

public void setQues(Question1 ques) {
	this.ques = ques;
}

public Answer1() {
	super();
	// TODO Auto-generated constructor stub
}

public Answer1(int aid, String answers, Question1 ques) {
	super();
	this.aid = aid;
	this.answers = answers;
	this.ques = ques;
}



}
