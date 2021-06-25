package com.ctingBiz2020.RPS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctingBiz2020.RPS.dao.Computer;
import com.ctingBiz2020.RPS.service.ComputerService;

@Controller
@RequestMapping("/")
public class ComputerController {

	@PostMapping("computer")
	@ResponseBody
	public int computerSelection(@RequestBody Computer data) {
		ComputerService computerService = new ComputerService();
		
		int newData = computerService.validateResult(data);
		return newData;
	}

}
