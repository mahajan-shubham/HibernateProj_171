package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	@Id
	private int Qid;
	private String Question;
	@OneToOne
	private Answer ans;

	public Questions(int qid, String question, Answer ans) {
		super();
		Qid = qid;
		Question = question;
		ans = ans;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQuestions() {
		return Question;
	}

	public void setQuestions(String questions) {
		Question = questions;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		ans = ans;
	}

	
}
