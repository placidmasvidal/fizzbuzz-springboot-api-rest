/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.controllers;

import java.util.concurrent.ThreadLocalRandom;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.placidmasvidal.fizzbuzzspringbootapirest.services.FizzBuzzServiceImpl;


/**
 * @author placidmasvidal
 *
 */
@Controller
public class FizzBuzzController {
	
	private final FizzBuzzServiceImpl fizzBuzzService;
	
	@Autowired
	public FizzBuzzController(FizzBuzzServiceImpl fizzBuzzService) {
		super();
		this.fizzBuzzService = fizzBuzzService;
	}
	
	@RequestMapping("/fizzbuzz/")
	public String getNumber(@RequestParam(name = "initNumber", required =false, defaultValue="-1") int initNumber, @RequestParam(name = "limit", required =false, defaultValue="-1") int limit, Model model) {		
		if(initNumber==-1) initNumber = ThreadLocalRandom.current().nextInt(0, FizzBuzzServiceImpl.limit);
		if(limit==-1) limit = FizzBuzzServiceImpl.limit;
		model.addAttribute("fizzbuzzstring", fizzBuzzService.generateFizzBuzzResult(initNumber, limit));
		return "fizzbuzz-result";
	}
	
}
