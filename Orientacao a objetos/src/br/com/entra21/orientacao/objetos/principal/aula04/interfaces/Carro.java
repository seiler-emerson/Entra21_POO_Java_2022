package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Carro implements Veiculo {

	@Override
	public void abastecer(String combustivel) {
		System.out.println("A "+combustivel+" esta bem cara.");
	}

	@Override
	public void acelerar(float velocidade) {
		System.out.println("Acelerando...."+velocidade+"Km/h");
	}

	@Override
	public String freiar() {
		System.out.println("Freiando...");
		return null;
	}
}
