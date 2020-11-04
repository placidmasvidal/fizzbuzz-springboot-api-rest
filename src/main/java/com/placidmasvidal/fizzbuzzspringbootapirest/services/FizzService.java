/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.scheduling.annotation.Async;

/**
 * @author placidmasvidal
 *
 */
public interface FizzService {

	String calculateFizzBuzz(int input);
	
	List<String> generateFizzBuzzResult(int initNumber, int limit);

	void save(List<String> fizzbuzzResult, LocalDateTime timestamp);
}
