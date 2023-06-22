package com.stack;

import java.util.*;

public class Answer {
       
	private String content;
	private User author;
	private int upvotes;
	private Date timestamp;
	
	public Answer(String content, User author) {
		
		this.content = content;
		this.author = author;
		
	}
	

	public String getContent() {
		return content;
	}
	public User getAuthor() {
		return author;
	}
	public int getUpvotes() {
		return upvotes;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void upvote() {
		upvotes++;
	}
	
}
