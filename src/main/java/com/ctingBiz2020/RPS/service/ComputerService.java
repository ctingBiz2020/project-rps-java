package com.ctingBiz2020.RPS.service;

import java.util.Random;

import com.ctingBiz2020.RPS.dao.Computer;

public class ComputerService {

	public int validateResult(Computer data) {
		int result = 2;
		Random rand = new Random();
		
		int computer = rand.nextInt(2);
		
		switch(data.player) {
		case 0:
			result = rockResult(computer);
			break;
		case 1:
			result = paperResult(computer);
			break;
		case 2:
			result = scissorsResult(computer);
			break;
		default:
			break;
		}
				
		return result;
	}
	
	public int rockResult(int computer) {
		
		switch(computer) {
		case 0:
			return 0;
		case 1:
			return -1;
		case 2:
			return 1;
		default:
			return 4;
		}
		
	}
	
	public int paperResult(int computer) {
		
		switch(computer) {
		case 0:
			return 1;
		case 1:
			return 0;
		case 2:
			return -1;
		default:
			return 4;
		}
		
	}
	
	public int scissorsResult(int computer) {
		
		switch(computer) {
		case 0:
			return -1;
		case 1:
			return 1;
		case 2:
			return 0;
		default:
			return 4;
		}
		
	}
}
