package com.ctingBiz2020.RPS.service;

import java.util.Random;

import com.ctingBiz2020.RPS.dao.Computer;

import org.springframework.stereotype.Service;

@Service
public class ComputerService {

	public Computer validateResult(Computer data) {
		Random rand = new Random();

		int computer = rand.nextInt(2);
		data.setComputer(computer);

		switch (data.getPlayer()) {
			case 0:
				rockResult(computer, data);
				break;
			case 1:
				paperResult(computer, data);
				break;
			case 2:
				scissorsResult(computer, data);
				break;
			default:
				System.out.println("Unknown value of player in validateResult");
				return data;
		}

		return data;
	}

	public void rockResult(int computer, Computer data) {

		switch (computer) {
			case 0:
				data.getScore().setTie(data.getScore().getTie() + 1);
				break;
			case 1:
				data.getScore().setLose(data.getScore().getLose() + 1);
				break;
			case 2:
				data.getScore().setWin(data.getScore().getWin() + 1);
				break;
			default:
				System.out.println("Unknown value of computer in rockResult");
		}

	}

	public void paperResult(int computer, Computer data) {

		switch (computer) {
			case 0:
				data.getScore().setWin(data.getScore().getWin() + 1);
				break;
			case 1:
				data.getScore().setTie(data.getScore().getTie() + 1);
				break;
			case 2:
				data.getScore().setLose(data.getScore().getLose() + 1);
				break;
			default:
				System.out.println("Unknown value of computer in paperResult");
		}

	}

	public void scissorsResult(int computer, Computer data) {

		switch (computer) {
			case 0:
				data.getScore().setLose(data.getScore().getLose() + 1);
				break;
			case 1:
				data.getScore().setWin(data.getScore().getWin() + 1);
				break;
			case 2:
				data.getScore().setTie(data.getScore().getTie() + 1);
				break;
			default:
				System.out.println("Unknown value of computer in scissorsResult");
		}

	}
}
