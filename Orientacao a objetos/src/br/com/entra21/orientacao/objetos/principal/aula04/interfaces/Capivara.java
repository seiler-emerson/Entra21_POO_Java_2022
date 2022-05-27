package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo {

	// Quando eu nao escrevo o meu construtor vazio e porque ele existe por padra.
	// Porem quando eu crio um construtor customizado eu perco a referencia do construtor vazio e preciso cria-lo.
	
	@Override
	public void alimentar(String alimento) {
		System.out.println("A Capivara come mato e "+alimento);
	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("...");
	}
}
