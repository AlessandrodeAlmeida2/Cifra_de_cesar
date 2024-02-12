package com.meuapp;

public class decriptar implements Codificador {
	@Override
	public String encriptar(String mensagem, int deslocamento) {
		char c;
		StringBuilder cifrado = new StringBuilder();
		
		for (char letra : mensagem.toCharArray()) {
			if (Character.isUpperCase(letra)) {
				c = (char)(Math.floorMod(letra - 'A'+ deslocamento, 26) + 'A');
			} else if (Character.isLowerCase(letra)) {
				c = (char)(Math.floorMod(letra - 'a'+ deslocamento, 26) + 'a');
			} else {
				c = letra;
			}
			
			cifrado.append(c);
		}
		
		return cifrado.toString();
	}
	
	@Override
	public String decript(String mensagemCodificada, int deslocamento) {
		return encriptar(mensagemCodificada, -1 * deslocamento);
	}

}
