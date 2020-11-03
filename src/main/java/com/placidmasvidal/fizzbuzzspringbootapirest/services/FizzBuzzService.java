/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author placidmasvidal
 *
 */
@Service
public class FizzBuzzService {
	
	public static int LIMIT;
	
	
	public String calculateFizzBuzz(int input) {
        if (input % 15 == 0) {
            return "fizzbuzz";
        } else if (input % 5 == 0) {
            return "buzz";
        } else if (input % 3 == 0) {
            return "fizz";
        }
		return String.valueOf(input);
	}
	
	public List<String> generateFizzBuzzResult(int initNumber, int limit){
		List<String> fizzBuzzResultList = new ArrayList<>();
		for(int i = initNumber; i<limit; i++) {
			fizzBuzzResultList.add(calculateFizzBuzz(i));
		}
		return fizzBuzzResultList;
	}

}
