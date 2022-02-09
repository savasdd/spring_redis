package com.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.custom.Service;

@RestController
@RequestMapping("/redis")
public class RedisController {

	@Autowired
	private Service service;

	private int say = 0;

	@GetMapping("/get")
	public String get() throws InterruptedException {
		say++;
		if (say == 3) {
			service.getAsync().clearCashe();
			say = 0;
		}
		return service.getAsync().getData();
	}

}
