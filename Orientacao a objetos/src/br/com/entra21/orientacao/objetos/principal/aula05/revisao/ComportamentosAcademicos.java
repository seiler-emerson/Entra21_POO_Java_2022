package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

public interface ComportamentosAcademicos {
	// Deve ser publico pois as classes precisam ter acesso
	// Neste caso retorna uma string
	// que pode ser aproveitado em um syso, alimentar variaveis, participar de um calculo
	public String realizarApresentacao();	
	
	// retorna uma string e precisa de um parametro recebido como um argumento
	public String gerarDossie(String nome); 
}
