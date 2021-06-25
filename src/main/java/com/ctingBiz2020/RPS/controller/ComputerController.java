package com.ctingBiz2020.RPS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ctingBiz2020.RPS.dao.Computer;
import com.ctingBiz2020.RPS.service.ComputerService;

@Controller
public class ComputerController {

	@PostMapping
	public int computerSelection(@RequestBody Computer data) {
		int result;
		ComputerService computerService = new ComputerService();
		result = computerService.validateResult(data);
		return result;
	}

}
