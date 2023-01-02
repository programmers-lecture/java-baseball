package com.example.baseball.balls;

/**
 * 비교 연산 및 결과 값을 담는 클래스
 */
public class Pitching {
	private final int strike;
	private final int ball;
	
	public Pitching(int strike, int ball) {
		this.strike = strike;
		this.ball = ball;
	}
	
	public static Pitching matches(Balls computer, Balls user) {
		// TODO 스트라이크 및 볼을 연산하는 로직을 구현한다.
		return null;
	}
	
	public boolean isStrike() {
		// TODO 스트라이크 여부를 판단하는 로직을 구현한다.
		return false;
	}
}
