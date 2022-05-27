package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Et implements Individuo {
	private String raca;
	
	public Et() {
		
	}

	public Et(String raca) {
		super();
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.raca+" come "+alimento);
	}

	@Override
	public void locomover() {
		System.out.println(this.raca+ " passa a maior parte do tempo sendo carregado pelo Mando, mas as vezes ele se arrasta.");
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.raca+" nao e muito de falar...");
	}
	
	
	
}
