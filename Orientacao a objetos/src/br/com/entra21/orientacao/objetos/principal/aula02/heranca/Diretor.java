package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

//removi os atributos comuns
//mantive os especificos

public class Diretor extends Pessoa {
	private String cursoAtual;
	private byte quantidadeProfessores;

	public Diretor() {
		super();
	}
	
	public Diretor(String nome, byte idade, String cpf, String cursoAtual, byte quantidadeProfessores) {
		super(nome, idade, cpf);
		this.cursoAtual = cursoAtual;
		this.quantidadeProfessores = quantidadeProfessores;
	}

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}
	
	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}
	
	public void realizarApresentacao() {
		System.out.println("Oi meu nome é " + getNome() + " e minha idade é " + this.getIdade());
	}
	
}