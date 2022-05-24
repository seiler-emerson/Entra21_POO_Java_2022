package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		byte opcao;
		
		do {
			System.out.println("Escolha uma opcao");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender Classes");
			System.out.println("3 - Aprender Heranca");
			opcao = entrada.nextByte();
			
			switch(opcao) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprenderHeranca();
				break;
			default:
				System.out.println("Por favor, escolhar uma opcao valida.");
				break;
			}
		} while(opcao!=0);
		
		
	}

	public static void aprenderClassesObjetos() {

		// O objeto da classe Scanner esta na variavel entrada, entao e um obejto.
		// Porem o System.i e uma chamada static pq
		// para acessar o in do system nao precisa criar o new.
		
		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();
		
		Diretor diretor2 = new Diretor();

		Diretor diretor3 = new Diretor("Paulo", (byte)80);
		diretor3.realizarApresentacao();
		
		
		Professor professorJava = new Professor();
		professorJava.setNome("Oliota");
		Professor professoraIngles = new Professor("Isabelle",(byte)30);
		
		System.out.println("Nome dela ="+professoraIngles.getNome());
		
		professoraIngles.setNome("Isabelle 2");
		
		System.out.println("Nome dela ="+professoraIngles.getNome());
		System.out.println("A idade dela e "+professoraIngles.getIdade());
		
		System.out.println("Os professores trabalham na "+Professor.instituicao);
		
		Aluno alunoTeste = new Aluno();
		alunoTeste.nome = "Emerson";
//		Aluno outroAluno = "Fulano";
		
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

		System.out.println("Bem vindo "+alunoNovato.respoderChamada());
	}
	
	public static void aprenderHeranca() {
		
	}
	
}
