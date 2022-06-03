import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

/*Leia N números informados pelo usuário e exiba:
 * O maior
 * O menor
 * A média
 * Quantos pares foram digitados
 * 
 */
public class Ex12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n, maior, menor, qtdPar, valor, soma;
		double media;
		
		//Obtendo N números
		System.out.println("Informe a quantidade de números:");
		n = read.nextInt();
		
		//Iniciando Variáveis
		maior = 0;
		menor = 400000;
		qtdPar = 0;
		media = 0;
		soma = 0;
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("N números"+i+":");
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
		
		//Imprimindo a solução
		System.out.println("Maior: \n"+maior);
		System.out.println("Menor: \n"+menor);
		System.out.println(qtdPar+" Números pares.");
		System.out.println("Média: "+media);
		

	}

}
