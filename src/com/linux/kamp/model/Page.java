package com.linux.kamp.model;

import java.util.ArrayList;
import java.util.List;

public class Page implements Commentable {
	protected String title;
	protected String content;
	protected List<Comment> comments;

	public Page(String title, String content) {
		super();
		this.title = title;
		this.content = content;

		// initialize the list
		this.comments = new ArrayList<Comment>();
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Title: " + title + "\n" + "Content: " + content;
	}

	@Override
	public void addComment(Comment comment) {
		comments.add(comment);
	}
}
