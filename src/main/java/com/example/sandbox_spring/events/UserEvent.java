package com.example.sandbox_spring.events;

import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {

	private String message;

	public UserEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
