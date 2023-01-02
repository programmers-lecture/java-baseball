package com.example.baseball.game;

import com.example.baseball.balls.Balls;
import com.example.baseball.balls.Pitching;
import com.example.baseball.io.Input;
import com.example.baseball.io.Output;
import com.example.baseball.strategy.NumberGenerator;

public class BaseBallGame {
	private final Input input;
	private final Output output;
	
	public BaseBallGame(Input input, Output output) {
		this.input = input;
		this.output = output;
	}
	
	/**
	 * 전체 게임의 트랜잭션을 책임지는 클래스
	 */
	public void run(NumberGenerator numberGenerator) {
		// 야구 게임은 게임을 끝낼 때까지 반복이 가능
		
		do {
			// 1. 게임 시작
			// 2. 컴퓨터(target) 숫자 생성
			Balls computer = numberGenerator.throwing();
			// 2.1 컴휴터가 생성한 숫자는 서로 다른 세 개 숫자로 이루어진다.
			Pitching pitching = new Round(input, output)
				.start(computer);
			// 3. 사용자 숫자 입력
			// 3.1 사용자가 입력한 숫자는 서로 다른 세 개 숫자로 이루어진다.
			// 4. 사용자 숫자와 컴퓨터 숫자 비교
			// 5. 사용자 숫자와 컴퓨터 숫자의 위치와 크기가 모두 같으면 게임 종료
			output.print(pitching.toString());
		} while(input.isReGame());
	}
}
