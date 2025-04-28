package com.sg.ai.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.ai.domain.user;

@RestController

public class Restcontroller {
	@GetMapping("/jblog")
	public user httpGet() {
		user finduser = user.builder().id(1).username("ai").password("222").email("s@s.home").build();
		return finduser;
	}
	
	@PostMapping("/jblog")
	public String httpPut(@RequestBody User user) {
		return "Post request processed" + user.toString();
		
	}
	
	@PutMapping("/jblog")
	public String httpput() {
		return "Put request processed";
	}
	
	
	@DeleteMapping("/jblog")
	public String httpDelete(@RequestParam int id) {
		return "Delete request processed";
	}

}
