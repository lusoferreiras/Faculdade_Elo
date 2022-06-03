package Aula05;

public class principalFinanciamento {

	public static void main(String[] args) {
		Financiamento mcmv = new Financiamento();
		mcmv.cpf = 123;
		mcmv.idade = 70;
		mcmv.limiteMeses = 360;
		mcmv.valor = 100000;
		
		if(mcmv.VerificarIdade(30)) {
			System.out.println("Financiamento liberado!");
		}else {
			System.out.println("Financiamento negado!");
		}

	}

}
