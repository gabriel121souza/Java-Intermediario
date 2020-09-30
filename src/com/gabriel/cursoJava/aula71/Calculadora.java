package com.gabriel.cursoJava.aula71;

public class Calculadora {
	private int soma;
	
	public synchronized int somaArray(int[] array) {
		soma =0;
		for(int i=0; i<array.length; i++) {
			soma += array[i];
			System.out.println("executando a soma " + Thread.currentThread().getName()+" somando o valor " + array[i]+ "com total de" + soma );
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return soma;
	}
		

}
 