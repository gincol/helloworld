package com.example.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class Monitor {
	
	private static final Logger log = LoggerFactory.getLogger(Monitor.class);


	@GetMapping(path = "/liveness")
	public @ResponseBody String liveness() {
		log.info("Monitor liveness OK");
		return "Monitor liveness OK";
	}
	
}
