package com.wfp.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.wfp.service.UserService;
import com.wfp.models.User;
import java.util.List;

@RestController
public class UserController {
    @Autowired
	private UserService userService;
	

	@GetMapping("list-users-json") 
	public List<User> listUsers() {		
		return userService.findAll();
	}

}
