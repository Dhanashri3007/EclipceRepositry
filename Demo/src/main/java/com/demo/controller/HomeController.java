package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ServiceI.HomerServiceI;
import com.demo.model.User;

@RestController
public class HomeController {
	
	@Autowired
    HomerServiceI hi;
	
	@GetMapping("getAllUsers")
	public ResponseEntity<List<User>>  getData() {
		
		List<User> users=hi.findAll();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@PostMapping("addUser")
	
	public ResponseEntity<User> addUser(@RequestBody User u)
	{
		User ur=hi.save(u);
		return new ResponseEntity<User>(ur, HttpStatus.OK);
	}
	
	@DeleteMapping("deleteUser/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable int uid)
	{
		
		hi.deleteById(uid);
		return new ResponseEntity<String>("User Delete Sucessully", HttpStatus.OK);
	}
	
	@PutMapping("updateUser/{uid}")
	public ResponseEntity<User> updateUser(@RequestBody User u,@PathVariable int uid)
	{
		User ur=hi.update(uid,u);
		return new ResponseEntity<User>(ur,HttpStatus.OK);
	}
}
