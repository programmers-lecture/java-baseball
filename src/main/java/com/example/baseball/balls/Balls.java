package com.example.baseball.balls;

import java.util.List;

/**
 * Ball에 대한 로직을 담은 일급 컬렉션 클래스
 */
public class Balls {
	private final List<Ball> balls;
	
	public Balls(List<Ball> balls) {
		this.balls = balls;
	}
	
	public boolean isStrike(Ball user, int idx) {
		// TODO 스트라이크 여부를 판단하는 로직을 구현한다.
		return false;
	}
	
	public boolean isBall(Ball user, int idx) {
		// TODO 볼 여부를 판단하는 로직을 구현한다.
		return false;
	}
}
