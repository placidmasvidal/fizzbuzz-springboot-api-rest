/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placidmasvidal.fizzbuzzspringbootapirest.repositories.FizzBuzzRepository;

/**
 * @author placidmasvidal
 *
 */
@Service
public class FizzBuzzServiceImpl implements FizzService{
	
	@Autowired
	private FizzBuzzRepository fizzBuzzRepository;
	
	public static int limit;
	
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
		save(fizzBuzzResultList, LocalDateTime.now());
		return fizzBuzzResultList;
	}

	public void save(List<String> fizzBuzzResult, LocalDateTime localDateTime) {
		fizzBuzzRepository.save(fizzBuzzResult, localDateTime);
	}
}
