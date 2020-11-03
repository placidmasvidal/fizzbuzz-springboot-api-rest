/**
 * 
 */
package com.placidmasvidal.fizzbuzzspringbootapirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.placidmasvidal.fizzbuzzspringbootapirest.services.FizzBuzzService;


/**
 * @author placidmasvidal
 *
 */
@Controller
public class FizzBuzzController {
	
	private final FizzBuzzService fizzBuzzService;
	
	@Autowired
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		super();
		this.fizzBuzzService = fizzBuzzService;
	}
	
	@RequestMapping("/fizzbuzz/")
	public String getNumber(@RequestParam(name = "initNumber", required =false, defaultValue="-1") int initNumber, @RequestParam(name = "limit", required =false, defaultValue="-1") int limit, Model model) {		
		if(initNumber==-1) initNumber = 20;
		if(limit==-1) limit = 50;
		model.addAttribute("fizzbuzzstring", fizzBuzzService.generateFizzBuzzResult(initNumber, limit));
		return "fizzbuzz-result";
	}
	
}
