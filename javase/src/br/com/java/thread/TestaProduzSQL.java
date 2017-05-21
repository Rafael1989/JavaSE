package br.com.java.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

public class TestaProduzSQL {
	public static void main(String[] args) {
		Collection<String> sqls = new Vector<>();
		//Collection<String> sqls = new ArrayList<>();
		//Collection<String> sqls = new HashSet<>();
		
		ProduzSQL produzSQL = new ProduzSQL(0, 10000, sqls);
		Thread thread = new Thread(produzSQL);
		
		ProduzSQL produzSQL2 = new ProduzSQL(10000, 20000, sqls);
		Thread thread2 = new Thread(produzSQL2);
		
		ProduzSQL produzSQL3 = new ProduzSQL(20000, 30000, sqls);
		Thread thread3 = new Thread(produzSQL3);
		
		thread.start();
		thread2.start();
		thread3.start();
		
		try {
			thread.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Threads produtoras de SQL finalizadas");
		
		for(int i = 0;i<15000;i++){
			if(!sqls.contains("SQL: "+i)){
				throw new IllegalStateException("não encontrei a SQL: "+i);
			}
		}
		
		if(sqls.contains(null)){
			throw new IllegalStateException("não devia ter null aqui dentro");
		}
		
		System.out.println("Fim da execução com sucesso");
	}
}
