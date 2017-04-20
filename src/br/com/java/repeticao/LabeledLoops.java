package br.com.java.repeticao;

public class LabeledLoops {

	public static void main(String[] args) {
		fora:
		for(int i = 0;i<10;i++){
			for(int j = 0; j<10;j++){
				if(i == 3){
				    break fora;
				}
				System.out.println(j);
				if(j == 2){
					continue fora;
				}
				
			}
		}
	}
}
