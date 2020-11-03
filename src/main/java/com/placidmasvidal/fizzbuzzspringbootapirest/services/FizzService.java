/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.services;

import java.util.List;

/**
 * @author placidmasvidal
 *
 */
public interface FizzService {

	String calculateFizzBuzz(int input);
	
	List<String> generateFizzBuzzResult(int initNumber, int limit);
}
