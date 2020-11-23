package com.wfp.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wfp.service.PositionService;
import com.wfp.models.Position;
import java.util.List;

@RestController
public class PositionControllerRest {

    @Autowired
    //private UserService userService;
    private PositionService positionService;
	

    @GetMapping("positions") 
	public List<Position> listPositions() {		
		return positionService.findAll();
	}


    @GetMapping("positionsUser")
    @ResponseBody
	public List<Position> listPositionsByUser(@RequestParam("email") String email) {
    	System.out.println(email);
	 	return positionService.findAllByUser(email);
     }
    
    
    
}
