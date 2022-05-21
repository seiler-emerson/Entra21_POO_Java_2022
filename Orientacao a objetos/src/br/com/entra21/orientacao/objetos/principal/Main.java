package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.classes.Professor;

public class Main {
	
	// O objeto da classe Scanner esta na variavel entrada, entao e um obejto.
	// Porem o System.i e uma chamada static pq
	// para acessar o in do system nao precisa criar o new.
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		Professor professorJava = new Professor();
		Professor professoraIngles = new Professor("Isabelle",(byte)30);
		
		System.out.println("Nome dela ="+professoraIngles.getNome());
		
		professoraIngles.setNome("Isabelle 2");
		
		System.out.println("Nome dela ="+professoraIngles.getNome());
		System.out.println("A idade dela e "+professoraIngles.getIdade());
		
		System.out.println("Os professores trabalham na "+Professor.instituicao);
		
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

		System.out.println("Bem vindo "+alunoNovato.respoderChamada());
	}

}
