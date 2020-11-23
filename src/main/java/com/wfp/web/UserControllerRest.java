package com.wfp.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wfp.service.UserService;
import com.wfp.models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class UserControllerRest {

    @Autowired
    private UserService userService;
	private List<User> lres;

    
    @GetMapping("users") 
	public List<User> listUsers(@RequestParam("site") String site) {
    	System.out.println("le site choisi:" + site);
    	List<User> l = userService.findAll();
    	lres = new ArrayList<>();
    	for (User user : l) {
    		//System.out.println(user.getSite());
			if (user.getSite().equals(site)){				
				lres.add(user);
			}
		}
    	
		return lres;
    }
    
        
}
