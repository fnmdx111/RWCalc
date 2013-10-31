package me.mad4a.util;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalNewtonSquareRoot {

	// TODO implement Newton Square Root or find a robust implementation
	public static BigDecimal sqrt(BigDecimal n) {
		return new BigDecimal(Math.sqrt(n.doubleValue()));
	}
}
