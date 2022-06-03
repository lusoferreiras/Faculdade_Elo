package Aula05;

public class principalCarro {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.modelo = "Fusca";
		fusca.anoFabricacao = 2020;
		fusca.capCombustivel = 30.0;
		fusca.consumoCombustivel = 0.2;
		
		fusca.autominia();
		fusca.calcularCombustivel(10);

	}

}
