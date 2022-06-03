package Aula05;

public class principalContato {

	public static void main(String[] args) {
		
		Contato ct = new Contato();
		
		ct.apelido = "Potchoco";
		ct.primeiroNome = "Antonio";
		ct.segundoNome = "Clemente";
		ct.email = "ads@gmail.com";
		ct.numeros = new int [3];
		ct.numeros [0] = 999999;
		ct.numeros [1] = 222222;
		ct.grupo = "";
		
		//Imprimindo
		System.out.println("Nome: "+ct.primeiroNome);
		System.out.println("Sobrenome: "+ct.segundoNome);
		System.out.println("Apelido: "+ct.apelido);
		System.out.println("Email: "+ct.email);
		System.out.println("Número 1: "+ct.numeros[0]);
		System.out.println("Número 2: "+ct.numeros[1]);

	}

}
