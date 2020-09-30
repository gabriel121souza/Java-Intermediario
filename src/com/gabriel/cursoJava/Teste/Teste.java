package com.gabriel.cursoJava.Teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com o seu nome");
		String nome = sc.next();
		System.out.println("entre com o a idade");
		int idade = sc.nextInt();
		
		System.out.println(nome);
		System.out.println(idade);
		

	}

}
