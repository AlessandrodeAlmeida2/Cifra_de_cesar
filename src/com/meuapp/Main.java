package com.meuapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mensagem encriptada: ");
		String mensagemEncriptada = scanner.nextLine();
		System.out.print("Palavra conhecida: ");
		String palavraConhecida = scanner.nextLine();
		
		QubraCodigo breaker = new QubraCodigo();
		String mensagemOriginal = breaker.quebraCodigo(mensagemEncriptada, palavraConhecida);
		System.out.println(mensagemOriginal);

		scanner.close();
	}

}
