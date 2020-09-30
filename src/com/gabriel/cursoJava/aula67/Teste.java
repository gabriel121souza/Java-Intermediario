package com.gabriel.cursoJava.aula67;

public class Teste {
	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start();
	
		MinhaThread threa2 = new MinhaThread("Thread #2", 900);
		MinhaThread threa3 = new MinhaThread("Thread #3", 500);

	}
	
}
