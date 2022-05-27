package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Humano extends Pessoa implements Individuo {
	
	public Humano() {
		
	}
	
	public void apresentarSe() {
		System.out.println("Oi menu nome é "+getNome());
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(getNome()+" pode comer quase tudo, inclusive "+alimento);
	}

	@Override
	public void locomover() {
		System.out.println(getNome()+" pode andar, mas nao correr, ele e manco. Pra piorar nao sabe nadar.");
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(getNome()+" faz parte do unico grupo de animais que sabe falar.");
		System.out.println(conteudo);
	}
	
}
