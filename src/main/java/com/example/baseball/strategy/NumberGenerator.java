package com.example.baseball.strategy;

import com.example.baseball.balls.Balls;

@FunctionalInterface
public interface NumberGenerator {
	Balls throwing();
}
