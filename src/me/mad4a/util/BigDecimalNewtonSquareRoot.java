package me.mad4a.util;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalNewtonSquareRoot {

	public static BigDecimal sqrt(BigDecimal n) {
		return new BigDecimal(Math.sqrt(n.doubleValue()));
	}
}
