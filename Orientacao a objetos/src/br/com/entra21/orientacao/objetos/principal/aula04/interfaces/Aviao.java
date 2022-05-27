package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Aviao implements Veiculo {
	private String modelo;
	
	public Aviao() {
		
	}

	public Aviao(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String freiar() {
		return "Aviao freia como? Usando o FLAP";
	}

	@Override
	public void acelerar(float velocidade) {
		System.out.println("Acelerando ate a velocidade até "+velocidade);
		
	}

	@Override
	public void abastecer(String combustivel) {
		System.out.println("Aqui vai muita querosene!");
		
	}
	
}
