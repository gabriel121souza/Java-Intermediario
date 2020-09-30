package com.gabriel.cursoJava.aula58;

public class TesteAutoboxing {
	public static void main(String[] args) {
		
		//autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 3.555;
		Boolean flag2 = false;
		Character b = 'b';
		
		//auto un-boxing
		int num13 = num9;
		
		//autoboxing em expressoes
		num9++;
		
		System.out.println(num9);
		
		//auto Unboxing num9 -> autoBoxing num13/num9 ->
		Integer num14 = num13/19;
		
		//mau uso
		Double a, d, c;
		a =10.0;
		d = 12.12;
		c  =4.7;
		Double media = (a+d+c)/3;
		System.out.println(media);

	}
}
