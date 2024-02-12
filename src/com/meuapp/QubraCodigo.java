package com.meuapp;

public class QubraCodigo {
	public String quebraCodigo(String mensagemEncriptada, String palavraConhecida) {
		decriptar cesar = new decriptar();
		
		for (int i = 0; i < 26; i++) {
			String mensagemOriginal = cesar.decript(mensagemEncriptada,i);
			if (mensagemOriginal.contains(palavraConhecida)) {
				return mensagemOriginal;
			}
		}
		return "";
	}
}
