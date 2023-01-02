package com.example.baseball.game;

import com.example.baseball.balls.Balls;
import com.example.baseball.balls.Pitching;
import com.example.baseball.io.Input;
import com.example.baseball.io.Output;

public class Round {
	private final Input input;
	private final Output output;
	
	public Round(Input input, Output output) {
		this.input = input;
		this.output = output;
	}
	
	public Pitching start(Balls computer) {
		
		Pitching pitching;
		do {
			// 3. 사용자 숫자 입력
			Balls user = input.throwing();
			// 4. 사용자 숫자와 컴퓨터 숫자 비교
			pitching = Pitching.matches(computer, user);
			// 5. 사용자 숫자와 컴퓨터 숫자의 위치와 크기가 모두 같으면 게임 종료
			output.print(pitching.toString());
			
		} while(!pitching.isStrike());
		
		return pitching;
	}
}
