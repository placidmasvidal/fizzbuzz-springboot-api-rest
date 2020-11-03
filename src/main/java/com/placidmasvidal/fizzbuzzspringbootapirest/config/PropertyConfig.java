/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.placidmasvidal.fizzbuzzspringbootapirest.services.FizzBuzzService;


/**
 * @author placidmasvidal
 *
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${limit}")
	String limit;
	
	
	@Bean
	public void fizzBuzzServiceProperties() {
		FizzBuzzService.LIMIT = Integer.valueOf(limit);

	}
	
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = 
                new PropertySourcesPlaceholderConfigurer();
        
        return propertySourcesPlaceholderConfigurer;
    }
}
