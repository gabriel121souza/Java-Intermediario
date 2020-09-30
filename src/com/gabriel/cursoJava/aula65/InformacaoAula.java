package com.gabriel.cursoJava.aula65;

public @interface InformacaoAula {
	String autor();
	int aulaNumero();
	String blog() default "http:gabriel.com";
	String site() default "http://gabriel.training";
}
