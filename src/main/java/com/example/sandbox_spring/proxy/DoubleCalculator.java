package com.example.sandbox_spring.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DoubleCalculator implements Calculator<Double> {
	@Override
	public Double sum(Double left, Double right) {
		log.debug("Double Calculator sum=" + left + " " + right);
		return left + right;
	}
}