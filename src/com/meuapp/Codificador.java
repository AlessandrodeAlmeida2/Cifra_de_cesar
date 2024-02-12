package com.meuapp;

public interface Codificador {
	String encriptar(String mensagem, int chave);
	String decript(String mensagemCodificada, int chabe);
}
