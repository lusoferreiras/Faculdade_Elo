import java.util.Scanner;

/*Crie 3 vetores de tamanho 3.
 * Os dois primeiros seão preenchidos pelo usuário.
 * O terceiro será a soma dos dois primeiros.
 * Imprima a soma.
 */
public class Ex14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int tam = 3;
		int [] v1 = new int[tam];
		int [] v2 = new int[tam];	
		int [] v3 = new int[tam];
		
		//Preencher vetor 1
		for (int i = 0; i < tam; i++) {
			System.out.println("V1["+i+"]:");
			v1[i] = read.nextInt();
		}
		
		//Preencher vetor 2
		for (int i = 0; i < tam; i++) {
			System.out.println("V2["+i+"]:");
			v2[i] = read.nextInt();
		}
		
		//Preencher vetor 3
		for (int i = 0; i < tam; i++) {
			v3[i] = v1[i]+v2[i];
			System.out.println("V3["+i+"]:"+v3[i]);
		}

	}

}
