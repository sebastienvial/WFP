package com.wfp.web;

// import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WfpController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

}
