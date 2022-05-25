package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa{

	//removi os atributos comuns
	//mantive os especificos
	
	private String cursoAtual;
	private byte quantidadeProfessores;
	public Diretor() {
		super();
	}
	
	public void realizarApresentacao() {
		System.out.println("Oi meu nome � "+getNome()+ " e minha idade � "+ this.getIdade());
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

	
	public Diretor(String nome, byte idade, String cpf, String cursoAtual, byte quantidadeProfessores) {
		super(nome, idade, cpf);
		this.cursoAtual = cursoAtual;
		this.quantidadeProfessores = quantidadeProfessores;
	}
	
	
}
