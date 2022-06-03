package Aula04;

import java.util.Scanner;

public class testeObjetos {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Carro van = new Carro();
		
		van.anoFabricacao = 1970;
		van.cor = "Verde";
		van.marca = "Fiat";
		van.modelo = "Doblo";
		van.npassageiro = 7;
		
		System.out.println("Modelo: "+van.modelo);
		System.out.println("Marca: "+van.marca);
		System.out.println("Cor: " +van.cor);
		System.out.println("Ano: "+van.anoFabricacao);
		System.out.println("Capacidade: "+van.npassageiro);
		
		
		Carro fusca = new Carro();
		fusca.anoFabricacao = 2020;
		fusca.cor = "Azul";
		fusca.marca = "Volkswagen";
		fusca.npassageiro = 5;
		fusca.modelo = "Fusca";
		
		System.out.println("Modelo: "+fusca.modelo);
		System.out.println("Marca: "+fusca.marca);
		System.out.println("Cor: "+fusca.cor);
		System.out.println("Ano: "+fusca.anoFabricacao);
		System.out.println("Capacidade: "+fusca.npassageiro);

	}

}
