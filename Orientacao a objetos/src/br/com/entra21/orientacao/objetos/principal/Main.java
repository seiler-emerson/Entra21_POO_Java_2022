package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Escolha uma opcao");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender Classes");
			System.out.println("2 - Aprender Heranca");
			opcao = entrada.nextByte();

			switch (opcao) {
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
		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {

		// O objeto da classe Scanner esta na variavel entrada, entao e um obejto.
		// Porem o System.i e uma chamada static pq
		// para acessar o in do system nao precisa criar o new.

		// === DIRETOR 1 === //
		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();	
		diretor1.setNome("Emerson");
		diretor1.setIdade((byte) 27);
		diretor1.setObervacao("obervando");

		// === DIRETOR 2 === //
		Diretor diretor2 = new Diretor();

		// === PROFESSOR JAVA === //
		Professor professorJava = new Professor();
		professorJava.setNome("Oliota");
		
		// === PROFESSORA INGLES === //
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);
		System.out.println("Nome dela =" + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("Nome dela =" + professoraIngles.getNome());
		System.out.println("A idade dela e " + professoraIngles.getIdade());
		System.out.println("Os professores trabalham na " + Professor.instituicao);

		// === ALUNO 1 === //
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Emerson";
		
		// === ALUNO 2 === //
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Fulano";

		// === ALUNO 3 === //
		Aluno aluno3;
		aluno3 = new Aluno();
		aluno3.idade = 18;
		aluno3.nome = "Rubem";
		aluno3.idade = 33;

		// === ALUNO 4 === //
		Aluno aluno4 = new Aluno();
		System.out.println("Qual o nome do aluno4?");
		aluno4.nome = entrada.next();
		System.out.println("Qual a idade do aluno4?");
		aluno4.idade = entrada.nextByte();
		System.out.println("Bem vindo " + aluno4.nome);
		System.out.println("Bem vindo " + aluno4.respoderChamada());
	}

	public static void aprenderHeranca() {

		Pessoa pessoa1 = new Pessoa();

		Diretor diretor3 = new Diretor("Paulo", (byte) 27, "0767566454", "Java", (byte) 3);
		diretor3.realizarApresentacao();

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 27);
		funcionario1.setNome("Emerson");
		funcionario1.setCargoAtual("Programador Jr");
		funcionario1.setSalario(4000);
		funcionario1.setObervacao("obervando");
		System.out.println("Ola meu nome e " + funcionario1.getNome() + " e tenho " + funcionario1.getIdade() + " anos");

		Funcionario funcionario2 = new Funcionario("Bruno", (byte) 22, "384798237", "programador Jr", 2500.5f);
		funcionario2.getCpf();
	}

}
