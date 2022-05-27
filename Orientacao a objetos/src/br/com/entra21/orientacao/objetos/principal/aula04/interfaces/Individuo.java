package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public interface Individuo {
	// Interfaces contem apenas a declaracao ou assinatura dos metodos sem implementacao
	// A classe que implementar esssa interface e obrigada a codificar o escopo de cada uma delas
	
	public void alimentar(String alimento);
	public void locomover();
	public void comunicar(String conteudo);
}
