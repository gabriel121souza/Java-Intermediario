package com.gabriel.cursoJava.aula74.labs;

public class ThreadSemafaro implements Runnable {
	private CorSemafaro cor;
	private boolean parar;
	private boolean corMudou;
	
	public ThreadSemafaro() {
		this.cor = CorSemafaro.VERMELHO;
		this.parar = false;
		this.corMudou = false;
		new Thread(this).start();
	}
	
	public CorSemafaro getCor() {
		return cor;
	}

	public void setCor(CorSemafaro cor) {
		this.cor = cor;
	}

	public boolean isParar() {
		return parar;
	}

	public void setParar(boolean parar) {
		this.parar = parar;
	}



	@Override
	public void run() {
		while(!parar) {
			try {
				switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;
				case AMARELO:
					Thread.sleep(300);
				case VERDE:
					Thread.sleep(1000);
					break;
				}
				//chamando um metodo dentro de outro metodo
				mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			break;
		case VERDE:
			this.cor = CorSemafaro.AMARELO;
			break;
		case AMARELO: 
			this.cor = CorSemafaro.VERMELHO;
		}
		this.corMudou =true;
		notify();
	}
	
	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			this.corMudou = false;
	}
	public synchronized void desligarSemafaro() {
		this.parar =true;
	}
}
