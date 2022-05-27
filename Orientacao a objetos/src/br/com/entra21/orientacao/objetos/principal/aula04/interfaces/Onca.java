package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Onca implements Individuo {
	private String raca;

	public Onca() {
		
	}
	
	public Onca(String raca) {
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
		System.out.println(this.raca+" e carnivora entao deveria comer "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(this.raca+" e considerada um felino completo, pois e boa em correr, nadar e escalar.");
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.raca+" ruge, mas aconselho voce a ouvir apenas EAD.");
		
	}
	
	
}
