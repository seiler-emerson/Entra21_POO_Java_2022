package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {
	// definir atributos de um aluno e cada objeto aluno tera essas variaveis, chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;
	public byte notas[][];
	
	// na declaracao só tem, acesso e tipo de retorno
	public Aluno() { //construtor vazio que ao utilizar o (new Aluno) ele é executado
		
	}
	
	public Aluno(String nomeLaDeFora) {
		this.nome= nomeLaDeFora;
	}
	
	public byte respoderChamada() {
		Scanner input = new Scanner(System.in);
		System.out.println("O aluno "+this.nome+" esta na "+Professor.instituicao);
		String resposta = input.next();
		if(resposta.equalsIgnoreCase("sim")) {
			quantidadePresencas++;
			// O this serve para reafirmar que estamos mencionando
			//um atributo do meu objeto.
		}
		return this.quantidadePresencas;
	}
	
	
}
