package com.ctingBiz2020.RPS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctingBiz2020.RPS.dao.Computer;
import com.ctingBiz2020.RPS.service.ComputerService;

@Controller
//@CrossOrigin("http://localhost:3000")
@CrossOrigin("https://project-rps.s3.us-east-2.amazonaws.com")
@RequestMapping("/")
public class ComputerController {

	@PostMapping("computer")
	@ResponseBody
	public Computer computerSelection(@RequestBody Computer data) {
		ComputerService computerService = new ComputerService();

		System.out.println(data.toString());
		Computer newData = computerService.validateResult(data);
		System.out.println(newData.toString());
		return newData;
	}
	
	@GetMapping
	public String testConncetion() {
		return "This is Chong backend!";
	}

}
