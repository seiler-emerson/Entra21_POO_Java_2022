package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;

public class Main {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		//byte inteiro=10;
		//String nome = "Rubem";
		//String outroNome = "Oliota"

		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();
		
		alunoObjeto.idade = 18;
		
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;
		
		outroAluno.nome = "Visitante";
		outroAluno.idade = 18;
		
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();
		
		System.out.println("Qual a idade do aluno novato?");
		alunoNovato.idade = entrada.nextByte();
		
		System.out.println("Bem vindo "+alunoNovato.nome);
	}

}
