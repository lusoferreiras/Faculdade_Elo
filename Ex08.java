import java.util.Scanner;

/*Elabore um exerc�cio que leia um n�mero N e exiba
 * a tabuada desse n�mero.
 * Exemplo, caso N seja 1, exibir 
 * resultado semelhante a imagem abaixo.
 */
public class Ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//Declarando Vari�veis
		int n;
		//Obter o valor de N;
		System.out.println("Digite um valor: ");
		n = read.nextInt();
		
		//Imprimindo a Tabuada
		for (int i = 0; i <=10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}

	}

}
