package com.example.demo.controller;



import java.util.List;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MultiplyController {
	

	//@GetMapping("/multiply/{p1}/{p2}")
	@PostMapping("/multiply")
	public int multiply(@RequestBody List<Integer> param){
		int result = param.get(0) * param.get(1);
		return result;
	}
	
	/*public String multiply(@RequestBody String param){
		return param;
	}*/
}
