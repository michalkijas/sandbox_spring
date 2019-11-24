package com.example.sandbox_spring.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserEventPublisher {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void emitEvent() {
		var event = new UserEvent(this, "Message to sent in event");
		applicationEventPublisher.publishEvent(event);
	}
}
