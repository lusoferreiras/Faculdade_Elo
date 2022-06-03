import java.util.Scanner;

/*01) Elabora uma classe em Java capaz de ler um 
 *número inteiro do usuário e verificar se 
 *ele é positivo.
 * 
 */
public class EX01 {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		int numero = 0;
		
		System.out.println("informe um número: ");
		numero =read.nextInt();
		
		
		if(numero>0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo");
		}
	}

}
