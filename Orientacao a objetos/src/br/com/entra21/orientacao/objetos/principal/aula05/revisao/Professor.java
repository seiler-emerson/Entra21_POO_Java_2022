package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements ComportamentosAcademicos {
	
	//atributos
	private Estudante estudantes[];
	private Disciplina disciplinas[];

	//construtores
	public Professor() {
		super();
	}

	public Professor(Estudante[] estudantes, Disciplina[] disciplinas) {
		super();
		this.estudantes = estudantes;
		this.setDisciplinas(disciplinas);
	}

	//construtores da super classe
	public Professor(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
	}

	
	public Professor(String nome, byte idade, String cpf, Estudante[] estudantes, Disciplina[] disciplinas) {
		super(nome, idade, cpf);
		this.estudantes = estudantes;
		this.disciplinas = disciplinas;
	}
	
	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public String realizarApresentacao() {
		String apresentacao = "Oi sou o professor "+super.getNome()+" e tenho "+this.estudantes.length;
		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {
		String mensagem = "";
		Estudante estudanteLocalizado=null;
		for(byte estudante=0;estudante<this.estudantes.length;estudante++) {
			if(this.estudantes[estudante]!=null && this.estudantes[estudante].getNome().equals(nome)){
				estudanteLocalizado = this.estudantes[estudante];
				break;
			}
		}
		if(estudanteLocalizado!=null) {
			mensagem = escreverDetalheDossie(estudanteLocalizado);
		} else {
			mensagem = "Esse aluno nao existe na minha lista.";
		}
		return mensagem;
	}

	private String escreverDetalheDossie(Estudante estudante) {
		String detalhe = "O estudante"+estudante.getNome()+" ja aprendeu "+estudante.getDisciplinas().length+" disciplinas.";
		detalhe+="\n Observações que eu percebi sobre este estudante:";
		detalhe+="\n"+estudante.getObervacao();
		return detalhe;
	}

}
