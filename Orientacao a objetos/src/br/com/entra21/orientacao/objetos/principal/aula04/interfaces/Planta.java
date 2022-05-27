package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo{
	private String nomeCientifico;

	public Planta() {
		
	}
	
	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCientifico+": - Eu nao preciso de "+alimento+" pois faco fotosintese.");
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCientifico+": - Nao preciso me mexer, consigo tudo sem sair daqui.");
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico+": - Planta nao fala! Ela ainda e MUDA!");	
	}
}
