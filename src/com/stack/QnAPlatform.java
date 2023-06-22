package com.stack;
import java.util.*;

public class QnAPlatform {
	
	public Map<String, User> users;
	public List<Question> questions;
	
	public QnAPlatform() {
		
		this.users = new HashMap<>();
		this.questions = new ArrayList<>();
	}
	
	public void userSignup(String name, String profession) {
		User user = new User(name, profession);
		users.put(name, user);
	}
	
	public void userLogout(User user) {
		
	}
	
	public void userLogin(User user) {
		
	}
	
	public void subscribeTopics(User user, String... topics) {
		
		for(String topic : topics) {
			user.subscribeTotopic(topic);
		}
	}
	
	public void addQuestion(String content, List<String> topics, User author) {
		
		Question question = new Question(content, topics, author);
		author.addQuestion(question);
		questions.add(question);
	}
	
	public void answerQuestion(Question question, String content, User author) {
		
		Answer answer = new Answer(content, author);
		question.addAnswer(answer);
	}
	
	public void acceptAnswer(Question question, Answer answer, User user) {
		user.acceptAnswer(question,  answer);
	}
	
	public void upvoteAnswer(Question question, Answer answer, User user) {
		user.upvoteAnswer(question, answer);
	}
	
	public List<Question> filterQuestionsByTopics(List<Question> questions, String... topics) {
		
		List<Question> filteredQuestions = new ArrayList<>();
		for(Question question : questions) {
			 for(String topic : topics) {
				 if(question.getTopics().contains(topic)) {
					 filteredQuestions.add(question);
					 break;
				 }
			 }
		}
		return filteredQuestions;
	}
	
	public List<Question> filterQuestionsByAnswers(List<Question> questions, boolean answered) {
		List<Question> filteredQuestions = new ArrayList<>();
		
		for(Question question : questions) {
			if((answered && question.getAcceptedAnswer()!=null) || (!answered && question.getAcceptedAnswer() == null)) {
				
				filteredQuestions.add(question);
			}
		}
		
		return filteredQuestions;
	}
	
	public void showFeed(User user, List<Question> questions) {
		
		for(Question question : questions) {
			
			System.out.println("Question: " + question.getContent());
			System.out.println("Author: " + question.getAuthor().getName());
			System.out.println("topics : " + question.getTopics());
			System.out.println("Number of answers: " + question.getAnswers().size());
			System.out.println("--------------------");
			
		}
	}
	
	public void showProfile(User user) {
			
				
			System.out.println("Name: " + user.getName());
			System.out.println("Profession: " + user.getProfession());
			System.out.println("Subscribed topics : " + user.getTopics());
			System.out.println("Number of Questions asked: " + user.getQuestions().size());
			System.out.println("--------------------");
		
	}

	public void showQuestion(Question question) {
		
		System.out.println("Question: " + question.getContent());
		// TODO Auto-generated method stub
		
	}	
	
	
	
	

}
