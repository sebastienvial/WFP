package com.wfp.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wfp.service.UserService;
import com.wfp.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserControllerRest {

    @Autowired
    private UserService userService;

    
    @GetMapping("users") 
	public List<User> listUsers(@RequestParam("site") String site) {
    	List<User> l = userService.findAll();
		List<User> lres = new ArrayList<>();
		String msite = "BSA"; 
		if (!site.isEmpty()) msite = site;
    	for (User user : l) {
			if (user.getSite().equals(msite)){				
				lres.add(user);
			}
		}
    	
		return lres;
	}
	
	@GetMapping("user")
	public Optional<User> getUser(@RequestParam("id") Integer id) {
		return userService.findOne(id);
	}
    
        
}
