package com.bs.mall.pojo;

import java.util.List;

public class Comment {
	private Integer commentId;
	private String commentContent;
	private List<User> users;
	private List<Book> books;
	private String commentDatatime;
	private String commentReply;
	private String commentReplyDatatime;
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getCommentReply() {
		return commentReply;
	}
	public void setCommentReply(String commentReply) {
		this.commentReply = commentReply;
	}
	public String getCommentDatatime() {
		return commentDatatime;
	}
	public void setCommentDatatime(String commentDatatime) {
		this.commentDatatime = commentDatatime;
	}
	public String getCommentReplyDatatime() {
		return commentReplyDatatime;
	}
	public void setCommentReplyDatatime(String commentReplyDatatime) {
		this.commentReplyDatatime = commentReplyDatatime;
	}
}
