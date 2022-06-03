import java.util.Scanner;

/*Elabore um exercício que leia quantos números devem ser
 * lidos do usuário, calcule a média e exiba o resultado. 
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double parada, valor, soma;
		soma = 0;
		System.out.println("Quantos valores deseja ler? ");
		parada = read.nextDouble();
		
		do {
			System.out.println("Digite um número: ");
			valor = read.nextDouble();
			soma = soma+valor;
			parada = parada-1;
			
		}while(parada>0);

		System.out.println("Soma: "+soma);
		double media = soma/parada;
		System.out.println("Média: "+media);
	}

}
