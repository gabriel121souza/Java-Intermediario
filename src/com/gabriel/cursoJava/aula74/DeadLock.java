package com.gabriel.cursoJava.aula74;

public class DeadLock {
	public static void main(String[] args) {
		final String RECURSO01 ="Recurso #1";
		final String RECURSO02 = "Recurso #2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (RECURSO01) {
					System.out.println("Thread #1: bloqueou recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread #1: Tentando acesso ao recurso 2");
					synchronized (RECURSO02) {
						System.out.println("Thread #2: bloqueou  recurso 2");
					}
					
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (RECURSO02) {
					System.out.println("Thread #2: bloqueou recurso 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread #2: Tentando acesso ao recurso 1");
					synchronized (RECURSO01) {
						System.out.println("Thread #2: bloqueou  recurso 1");
					}
					
				}
			}
		};
		t1.start();
		t2.start();
		
		
	}
}
