package com.gabriel.cursoJava.aula55;

import com.gabriel.cursoJava.aula53.DiaSemana;

public class TesteEnum2 {
	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
			DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
			System.out.println(dia);
			
	}
}
