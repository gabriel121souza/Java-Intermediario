package com.gabriel.cursoJava.aula55;

import com.gabriel.cursoJava.aula54.DiaSemana;

public class TesteEnum {
	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values();
		
		for(DiaSemana dia: DiaSemana.values()) {
			System.out.println(dia);
		}
	}
}
