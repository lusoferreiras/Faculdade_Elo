package Aula05;

public class Financiamento {
	int cpf;
	double valor;
	int limiteMeses;
	int idade; //70
	
	boolean VerificarIdade(int qtdanos) {
		//Idade n�o pode ultrapassar 80;
		int idadeLimite;
		idadeLimite = idade+qtdanos;
		if(idadeLimite<80) {
			
			return true;
		}else {
			
			return false;
		}
	}

}
