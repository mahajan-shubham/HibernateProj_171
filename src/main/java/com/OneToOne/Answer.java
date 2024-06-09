package com.OneToOne;

import javax.persistence.OneToOne;

public class Answer<Questions> {
private int Aid;

private String Answers;
@OneToOne
private Questions Ques;
public int getAid() {
	return Aid;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public Answer(int aid, String answers, Questions ques) {
	super();
	Aid = aid;
	Answers = answers;
	Ques = ques;
}
public void setAid(int aid) {
	Aid = aid;
}
public String getAnswers() {
	return Answers;
}
public void setAnswers(String answers) {
	Answers = answers;
}
public Questions getQues() {
	return Ques;
}
public void setQues(Questions ques) {
	Ques = ques;
}

}
