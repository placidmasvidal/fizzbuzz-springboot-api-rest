/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.config;

import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author placidmasvidal
 *
 */
@Configuration
@EnableAsync
public class ThreadConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ThreadConfig.class);
	
	@Bean(name = "taskExecutor")
	public Executor taskExecutor() {
		LOGGER.debug("Creating Async Task Executor");
		final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("FizzBuzzThread -");
		executor.initialize();
		
		return executor;
	}
}
