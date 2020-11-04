/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.config;

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

	@Bean(name = "specificTaskExecutor")
	public TaskExecutor specificTaskExecutor() {
		
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.initialize();
		return executor;
		
	}
	
}
