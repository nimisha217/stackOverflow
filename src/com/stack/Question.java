package com.stack;

import java.util.*;

public class Question {
	
	private String content;
	private List<String> topics;
	private User author;
	private Answer acceptedAnswer;
	private List<Answer> answers;
	public Question(String content, List<String> topics, User author) {
		this.content = content;
		this.topics = topics;
		this.author = author;
		this.answers = new ArrayList<>();
	}
	public String getContent() {
		return content;
	}
	public List<String> getTopics() {
		return topics;
	}
	public User getAuthor() {
		return author;
	}
	public Answer getAcceptedAnswer() {
		return acceptedAnswer;
	}
	
	public void setAcceptedAnswers(Answer answer) {
		
		this.acceptedAnswer = answer;
		
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
	
	public void upvoteAnswer(Answer answer) {
		answer.upvote();
	}
	

}
