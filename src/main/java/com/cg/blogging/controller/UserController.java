package com.cg.blogging.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

//import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.blogging.BloggingAppApplication;
import com.cg.blogging.dao.UserJPARepository;
import com.cg.blogging.entities.User;
import com.cg.blogging.exception.IdNotFoundException;
import com.cg.blogging.service.UserService;

@Validated
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserJPARepository userJPARepository;
	
	private static final Logger log = LogManager.getLogger(BloggingAppApplication.class);
	
	/*
	
		@GetMapping("/user/{userId}")
		public ResponseEntity<User> findUser(@PathVariable("userId")Integer userId){
			log.info("Controller Layer - Entry - findUser");
			log.info("Controller Layer - Exit - findUser");
			System.out.println("gget user id"+userId);
			User user=userService.getUser(userId);
			System.out.println("gget user id123: "+user);
			if(user == null) {
				return new ResponseEntity("Sorry! users not found!",HttpStatus.NOT_FOUND);
			}
		return new ResponseEntity<User>(user,HttpStatus.OK);

			}
	
		
	/*	@PostMapping("/users")
		public ResponseEntity<List<User>> addNewUser(@Valid @RequestBody User user) throws IdNotFoundException
		{
			log.info("Controller Layer - Entry - addUser");
			log.info("Controller Layer - Exit - addUser");
			List<User> users=null;
			users=userService.addNewUser(user);
		if(users== null) {
			return new ResponseEntity("Sorry! User is null!", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		}
		
		@PostMapping(value={"/signIn"})
		public ResponseEntity<User> signIn(@Valid @RequestBody User user) {
			
			log.info("Controller Layer - Entry - signInuser");
			log.info("Controller Layer - Exit - signInuser");
			System.out.println("gget user id"+user.getUserId());
			User getUserDb = userService.signIn(user);
			System.out.println("getUserDb user id123: "+getUserDb);
			if(user == null) {
				return new ResponseEntity("Sorry! users not found!",HttpStatus.NOT_FOUND);
			}else {
			
			if(user.getUserId() == getUserDb.getUserId() && user.getPassword().equalsIgnoreCase(getUserDb.getPassword())) {
				return new ResponseEntity("SignIn Succesfully",HttpStatus.OK);
			}else{

				return new ResponseEntity("Sorry! invalid user or password!",HttpStatus.NOT_FOUND);
			}
			}
			
			
		}
		@PostMapping(value={"/signOut"})
		public ResponseEntity<User> signOut(@Valid @RequestBody User user) throws IdNotFoundException{
			log.info("Controller Layer - Entry - signOutuser");
			log.info("Controller Layer - Exit - signOutuser");
			//Optional<User> user1=userJPARepository.findById(user.getUserId());
		      User user1 = userService.signOut(user);
			return new ResponseEntity("signout Successfully",HttpStatus.ACCEPTED);
		}
		
		
		}*/
	@PostMapping("/user")
	public ResponseEntity<User> addNewUser(@Valid @RequestBody User user) {
		log.info("adding the new user");
		
		User user11 = userService.addNewUser(user);
	
		
		return new ResponseEntity("User added successfully !", HttpStatus.ACCEPTED);
	
		
	}

	@DeleteMapping(value = { "/deleteuser/{userId}" })
	public ResponseEntity<User> removeUser(@Valid @RequestBody User ud) throws IdNotFoundException {
		log.info("By this, your Id will be removed");
		User udto = userService.removeUser(ud);

		return new ResponseEntity("Your account has been removed successfully !", HttpStatus.ACCEPTED);
	}

	@PutMapping(value={"/signIn"})
	public ResponseEntity<Object> signIn(@Valid @RequestBody User user) throws IdNotFoundException {
		User u= userService.signIn(user);
		
		return new ResponseEntity("signin  Successfully",HttpStatus.ACCEPTED);
		
		
	}
	@PostMapping(value={"/signOut"})
	public ResponseEntity<User> signOut(@Valid @RequestBody User user){
		
		User u= userService.signOut(user);
		if(u==null) {
			return new ResponseEntity("no user found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity("signout Successfully",HttpStatus.ACCEPTED);
	}
	@GetMapping(value= {"/allusers"})
	    public List<User> getAllUsers() {
		   List<User> all = userService.getAllUsers();
	        return all;
	    }


}


		
	