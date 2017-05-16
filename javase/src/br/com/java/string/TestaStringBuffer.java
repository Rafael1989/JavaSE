package br.com.java.string;

public class TestaStringBuffer {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("a");
		stringBuffer.append(" b");
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
}
