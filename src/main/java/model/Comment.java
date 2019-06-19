package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Comment {
	private String comment;
	private String name;
	private LocalDateTime date;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public String getDate(String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
	}
}
