package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {

	// Atributos static sao de dominio da CLASSE e nao de cada objeto
	//entao nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acessos static basta informar a Classe.oQueVoceQuer, sem utilizar o new
	public static String instituicao="Proway";
	
	// Atributos devem ser private e se possive
	// criar gets e sets para quem realmente precisa
	private String nome;
	private byte idadeAtual;
	private byte quantidadeAlunos;
	
	public Professor() {
		
	}
	
	public Professor(String novoNome, byte idade) {
		this.nome=novoNome;
		this.idadeAtual=idade;
		
		//construtor com paramentros
		//pode inicializar alguns argumentos ou todos os atributos.
	}
	
	public String getNome() {
		// ler o valor
		return this.nome;
	}
	
	public void setNome(String nome) {
		// devolver um valor para fora
		this.nome=nome;
	}
	
	public byte getIdade() {
		return this.idadeAtual;
	}
	
}
