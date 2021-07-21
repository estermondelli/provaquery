package it.corso.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ContattoController {
	
	@RequestMapping("/init")
	@ResponseBody
	public void init() {
		
	}

	@RequestMapping("/query")
	@ResponseBody
	public void query() {
		
	}
	
}
