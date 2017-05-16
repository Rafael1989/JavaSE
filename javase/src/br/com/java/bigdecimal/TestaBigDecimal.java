package br.com.java.bigdecimal;

import java.math.BigDecimal;

public class TestaBigDecimal {
	public static void main(String[] args) {
		BigDecimal bigDecimal = new BigDecimal("300.00");
		BigDecimal bigDecimal2 = new BigDecimal("600.00");
		bigDecimal = bigDecimal.add(bigDecimal2);
		System.out.println(bigDecimal);
	}
}
