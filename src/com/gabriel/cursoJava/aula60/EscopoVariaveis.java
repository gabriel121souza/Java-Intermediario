package com.gabriel.cursoJava.aula60;

public class EscopoVariaveis {
	private int valor;
	
	public int getValor() {
		return valor;
		
	}
	public void setValor(int valor) {
		this.valor = valor;
		
	}
	public int calculaValor(int valor) {
		valor = valor+10;
		return valor;
	}
	public int teste() {
		int valor = 5;
		if(true) {
			valor--;
		}
		return valor;
	}
	public void outroTeste() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		//i++ erro de compilacao
		int j;
		for(j=0; j<10; j++) {
			System.out.println(j);// j tem valor 10
		}
		System.out.println(j);
	}
	public void maisUmteste() {
		boolean flag = true;
		if(flag) {
			int umaVariavel =10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
		//System.out.println(umaVariavel);//erro de compilacao;
		
	}
		public void maisUmOutroTeste(int num) {
			int total =0;
			try {
				int outroNum =0;
				total = num/outroNum;
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				total++;
			}
			num++;
			
			//outroNum++ //erro
			//e.printStackTrace() //erro
		}
	}
