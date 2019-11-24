package com.example.sandbox_spring.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.*;

/**
 * https://www.baeldung.com/spring-context-events
 */
@Slf4j
class SpringContextEventsListener {

	/**
	 * On either initializing or refreshing the ApplicationContext, Spring raises the ContextRefreshedEvent.
	 * Typically a refresh can get triggered multiple times as long as the context has not been closed.
	 * <p>
	 * Notice that, we can also have the event triggered manually by calling the refresh() method on the ConfigurableApplicationContext interface.
	 */
	@EventListener
	void handleContextRefreshedEvent(ContextRefreshedEvent event) {
		log.debug("ContextRefreshedEvent: " + event.toString());
	}

	/**
	 * By calling the start() method on the ConfigurableApplicationContext, we trigger this event and start the ApplicationContext.
	 * As a matter of fact, the method is typically used to restart beans after an explicit stop. We can also use the method to deal components with no configuration for autostart.
	 * <p>
	 * Here, it's important to note that the call to start() is always explicit as opposed to refresh().
	 */
	@EventListener
	void handleContextStartedEvent(ContextStartedEvent event) {
		log.debug("ContextStartedEvent: " + event.toString());
	}

	/**
	 * A ContextStoppedEvent is published when the ApplicationContext is stopped, by invoking the stop() method on the
	 * ConfigurableApplicationContext. As discussed earlier, we can restart a stopped event by using start() method.
	 */
	@EventListener
	void handleContextStoppedEvent(ContextStoppedEvent event) {
		log.debug("ContextStoppedEvent: " + event.toString());
	}

	/**
	 * This event is published when the ApplicationContext is closed, using the close() method in ConfigurableApplicationContext.
	 * In reality, after closing a context, we cannot restart it.
	 * <p>
	 * A context reaches its end of life on closing it and hence we cannot restart it like in a ContextStoppedEvent.
	 */
	@EventListener
	void handleContextClosedEvent(ContextClosedEvent event) {
		log.debug("ContextClosedEvent: " + event.toString());
	}
}
