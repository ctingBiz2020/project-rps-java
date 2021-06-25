package com.ctingBiz2020.RPS.dao;

import lombok.Data;

@Data
public class Computer {
	class Score {
		int win;
		int lose;
		int tie;
	}
	public int player;
	public int computer;
	
	Score score = new Score();
}

