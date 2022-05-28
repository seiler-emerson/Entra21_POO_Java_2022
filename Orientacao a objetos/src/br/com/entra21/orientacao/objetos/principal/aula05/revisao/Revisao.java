package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import java.util.Scanner;

public class Revisao {
	
	static Scanner input = new Scanner(System.in);
	static Professor oliota;
	
	public static void revisar() {
	 
		byte opcao;
		
		gerarDados();
		
		do {

			System.out.println("Escolha a opcao");
			System.out.println("0 - Sair");
			System.out.println("1 - Revisar");
			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo..");
				break;
			case 1:
				
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}

		} while (opcao!=0);

	}
	
	private static void gerarDados() {
		
		oliota = new Professor("Oliota", (byte)33, "123.456.789-00");
	}
}
