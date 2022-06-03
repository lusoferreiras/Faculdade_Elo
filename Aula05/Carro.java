package Aula05;

public class Carro {
	String cor;
	String marca;
	String modelo;
	int anoFabricacao;
	int npassageiro;
	double consumoCombustivel;
	double capCombustivel;
	
	void autominia() {
		double auto = consumoCombustivel*capCombustivel;
		System.out.println("Autonomia de: "+auto);
	}
	
	void calcularCombustivel(double km) {
		double distacia = km/consumoCombustivel;
	}
	

}
