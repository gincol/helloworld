package com.example.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.utils.Utils;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);


	@GetMapping(path = "/world")
	public @ResponseBody String getAllUsers() {
		log.info("Busqueda de todos los usuarios");
		return "Hello World desde " + Utils.getIp();
	}
	
}
