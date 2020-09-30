package com.gabriel.cursoJava.aula63;

public class ExemploPrintf {
	public static void main(String[] args) {
		
		System.out.println("essa e uma saida");
		System.out.printf("Hello %s", "Ola, mundo1");
		System.out.println();
		System.out.printf("%S", "ola, mundo"); //caixa alta
		System.out.println();
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		System.out.printf("%n");//pular linha;
		
		int valor = 123456789;
		System.out.printf("%d", valor);//expressoes regulares para numeros inteiros;
		System.out.println();
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();
		
		String olaMundo = "Ola, Mundo! ";
		System.out.printf("%20s", olaMundo);
		System.out.println();
		
		System.out.printf("%+d", valor); //imprimir se o valor e negativo ou positivo
		System.out.println();
		
		System.out.printf("%015d", valor); //acrescenta o zero
		System.out.println();
		
		System.out.printf("%,d", valor);//separar os numeros com virgula ou ponto;
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); // o valor negativo com -
		System.out.println();
		System.out.printf("% d", valor); // o valor positivo com +
		System.out.println();
		System.out.printf("%.3f", pontoFlutuante);//arrendoda para 3 casa decimais depois da virgula
		System.out.println();
		System.out.printf("R$%10.2f", pontoFlutuante);
		System.out.println();
		testeMaisCompleto();
		
	}
	private static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
			for(int i=0; i<precos.length; i++) {
				System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
			}
			//java.util.Formater
	}
}
