import java.util.Scanner;

/*Elabore um exerc�cio que leia quantos n�meros devem ser
 * lidos do usu�rio, calcule a m�dia e exiba o resultado. 
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double parada, valor, soma;
		soma = 0;
		System.out.println("Quantos valores deseja ler? ");
		parada = read.nextDouble();
		
		do {
			System.out.println("Digite um n�mero: ");
			valor = read.nextDouble();
			soma = soma+valor;
			parada = parada-1;
			
		}while(parada>0);

		System.out.println("Soma: "+soma);
		double media = soma/parada;
		System.out.println("M�dia: "+media);
	}

}
