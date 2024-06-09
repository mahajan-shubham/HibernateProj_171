package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1 {
	@Id
private int qid;
private String questions;

public Question1(int qid, String questions, List<Answer1> ans) {
	super();
	this.qid = qid;
	this.questions = questions;
	this.ans = ans;
}

public Question1() {
	super();
	// TODO Auto-generated constructor stub
}

public int getQid() {
	return qid;
}

public void setQid(int qid) {
	this.qid = qid;
}

public String getQuestions() {
	return questions;
}

public void setQuestions(String questions) {
	this.questions = questions;
}

public List<Answer1> getAns() {
	return ans;
}

public void setAns(List<Answer1> ans) {
	this.ans = ans;
}

@OneToMany
private List<Answer1> ans;
}
