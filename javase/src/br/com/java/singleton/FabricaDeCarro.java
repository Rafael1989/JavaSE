package br.com.java.singleton;

public class FabricaDeCarro {
	
	private static FabricaDeCarro fabricaDeCarro = null;
	
	public static FabricaDeCarro getInstance(){
		if(fabricaDeCarro == null){
			fabricaDeCarro = new FabricaDeCarro();
		}
		
		return fabricaDeCarro;
	}
	
	
}
