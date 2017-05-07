package br.com.java.singleton.teste;

import br.com.java.singleton.FabricaDeCarro;

public class FabricaDeCarroTeste {

	public static void main(String[] args) {
		FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getInstance();
		FabricaDeCarro fabricaDeCarro2 = FabricaDeCarro.getInstance();
		System.out.println(fabricaDeCarro);
		System.out.println(fabricaDeCarro2);
	}
}
