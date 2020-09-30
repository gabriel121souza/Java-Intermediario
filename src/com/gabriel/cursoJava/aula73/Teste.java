package com.gabriel.cursoJava.aula73;

public class Teste {

	public static void main(String[] args) {
		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		System.out.println("pausando a thread #1");
		t1.suspend();
		
		try {
			Thread.sleep(200);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("pausando a thread #2");
		t2.suspend();
		System.out.println("resumindo a thread #1");
		t1.resume();
		System.out.println("resumindo a thread #1");
		t2.resume();
		System.out.println("terminando #2");
		t2.stop();


	}
}
