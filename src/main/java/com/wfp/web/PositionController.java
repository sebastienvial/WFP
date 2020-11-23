package com.wfp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wfp.models.Position;
import java.util.List;


import com.wfp.service.PositionService;

@Controller
public class PositionController {
	
	@Autowired
	private PositionService positionService;
	

	@GetMapping("list-positions-json") 
	public List<Position> listPositions() {		
		return positionService.findAll();
	}

	@GetMapping("list-positions") 
	public String listPositions(Model model) {
		model.addAttribute("positions", positionService.findAll());
		
		return "views/list-positions";
	}
	
	@GetMapping("add-position")
	public String addPosition() {
		return "views/add-position";
	}

	@GetMapping("delete-position")
	public String deletePosition(@RequestParam("idPosition") Integer id) {
		return "redirect:/list-positions";
	}

	@GetMapping("edit-position")
	public String editPosition(@RequestParam("idPosition") Integer id) {
		return "views/add-position";
	}

	@GetMapping("detail-position")
	public String detailPosition(@RequestParam("idPosition") Integer id) {
		return "views/detail-position";
	}
	


}
