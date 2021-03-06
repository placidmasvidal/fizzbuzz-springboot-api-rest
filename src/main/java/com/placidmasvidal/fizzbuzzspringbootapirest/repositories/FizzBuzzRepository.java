/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.repositories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.placidmasvidal.fizzbuzzspringbootapirest.controllers.CustomException;

/**
 * @author placidmasvidal
 *
 */
@Component
public class FizzBuzzRepository {

	@Async("taskExecutor")
	public void save(List<String> fizzBuzzResultList, LocalDateTime localDateTime) throws CustomException{

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("fizzBuzz.log"))){
			for (String s : fizzBuzzResultList) {
				bw.write(s);
				bw.newLine();
			}
			bw.newLine();
			bw.write(String.valueOf(localDateTime));
		} catch (IOException e) {
			throw new CustomException("I/O error writing fizzbuzz to log file");
		}
	}

}
