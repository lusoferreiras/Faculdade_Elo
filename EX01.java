import java.util.Scanner;

/*01) Elabora uma classe em Java capaz de ler um 
 *n�mero inteiro do usu�rio e verificar se 
 *ele � positivo.
 * 
 */
public class EX01 {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		int numero = 0;
		
		System.out.println("informe um n�mero: ");
		numero =read.nextInt();
		
		
		if(numero>0) {
			System.out.println("O n�mero � positivo!");
		} else {
			System.out.println("O n�mero � negativo");
		}
	}

}
