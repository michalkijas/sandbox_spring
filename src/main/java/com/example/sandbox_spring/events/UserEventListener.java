package com.example.sandbox_spring.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserEventListener implements ApplicationListener<UserEvent> {

	@Override
	public void onApplicationEvent(UserEvent event) {
		log.debug("Receive event message=" + event.getMessage());
	}
}
