package br.com.java.string;

public class TestaStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append(" b");
		sb.reverse();
		System.out.println(sb);
	}
}
