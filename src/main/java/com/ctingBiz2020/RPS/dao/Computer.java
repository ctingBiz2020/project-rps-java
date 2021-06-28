package com.ctingBiz2020.RPS.dao;

import lombok.Data;

@Data
public class Computer {
	@Data
	public class Score {
		private int win;
		private int lose;
		private int tie;
	}

	private int player;
	private int computer;

	Score score = new Score();
}
