package com.ctingBiz2020.RPS.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.ctingBiz2020.RPS.dao.Computer;
import com.ctingBiz2020.RPS.service.ComputerService;

@RestController
//@CrossOrigin("http://localhost:3000")
//@CrossOrigin("https://project-rps.s3.us-east-2.amazonaws.com")
@CrossOrigin
public class ComputerController {

	@PostMapping("/computer")
	public Computer computerSelection(@RequestBody Computer data) {
		ComputerService computerService = new ComputerService();

		System.out.println(data.toString());
		Computer newData = computerService.validateResult(data);
		System.out.println(newData.toString());
		return newData;
	}

	@RequestMapping("/")
	public String testConncetion() {
		return "This is Chong backend!";
	}

}
