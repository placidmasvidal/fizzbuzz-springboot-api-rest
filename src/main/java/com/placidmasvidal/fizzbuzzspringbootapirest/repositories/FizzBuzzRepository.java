/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.repositories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author placidmasvidal
 *
 */
@Component
public class FizzBuzzRepository {

	public void save(List<String> fizzBuzzResultList, LocalDateTime localDateTime) {

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("fizzBuzz.log"))){
			for (String s : fizzBuzzResultList) {
				bw.write(s);
				bw.newLine();
			}
			bw.newLine();
			bw.write(String.valueOf(localDateTime));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
