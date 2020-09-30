package com.gabriel.cursoJava.aula66;

import com.gabriel.cursoJava.aula61.Contato;

public class ColetorLixo {
	public static void obterMemoriaUsada() {
		final int MB = 1024 *1024;
		Runtime runtime = Runtime.getRuntime(); //singleton;
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB); 
		
	}

	public static void main(String[] args) {
		Contato[] contatos = new Contato[100000];
		Contato contato;
		for(int i=0; i<contatos.length; i++) {
			contato= new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
			contatos[i] =contato;
		}
		System.out.println("Contatos criados ");
		
		obterMemoriaUsada();
		contatos =null;
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		System.out.println("contatos removidos da memoria");
		obterMemoriaUsada();
	}

}
