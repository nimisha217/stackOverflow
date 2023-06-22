package com.stack;

import java.util.*;


public class User {
	
	private String name;
	private String profession;
	private List<String> topics;
	private List<Question> questions;
	public User(String name, String profession) {
		super();
		this.name = name;
		this.profession = profession;
		this.topics = new ArrayList<String>();
		this.questions = new ArrayList<Question>();
	}
	public String getName() {
		return name;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public List<String> getTopics() {
		return topics;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void subscribeTotopic(String topic) {
		
		topics.add(topic);
	}
	
	public void addQuestion(Question question) {
		questions.add(question);
	}
	
	public void acceptAnswer(Question question, Answer answer) {
		
		if(questions.contains(question)) {
			question.setAcceptedAnswers(answer);
		}
	}
	
	public void upvoteAnswer(Question question, Answer answer) {
		
		if(topics.contains(question.getTopics())) {
			answer.upvote();
		}
	}
	
	
	
	
	

}
