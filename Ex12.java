import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

/*Leia N n�meros informados pelo usu�rio e exiba:
 * O maior
 * O menor
 * A m�dia
 * Quantos pares foram digitados
 * 
 */
public class Ex12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n, maior, menor, qtdPar, valor, soma;
		double media;
		
		//Obtendo N n�meros
		System.out.println("Informe a quantidade de n�meros:");
		n = read.nextInt();
		
		//Iniciando Vari�veis
		maior = 0;
		menor = 400000;
		qtdPar = 0;
		media = 0;
		soma = 0;
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("N n�meros"+i+":");
			valor = read.nextInt();
			if(valor>maior) {
				maior = valor;
			}
			if(valor<menor) {
				menor = valor;
			}
			if(valor%2==0) {
				qtdPar++;
			}
			soma = soma+valor;
		}
		media = soma/n;
		
		//Imprimindo a solu��o
		System.out.println("Maior: \n"+maior);
		System.out.println("Menor: \n"+menor);
		System.out.println(qtdPar+" N�meros pares.");
		System.out.println("M�dia: "+media);
		

	}

}
