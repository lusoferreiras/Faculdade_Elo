/*Usando a estrutura de repetição Do While,
 * elabore um código que imprima na tela os números de 10 a 0. 
 */
public class Ex06 {

	public static void main(String[] args) {
		int cont = 10;
		
		do {
			System.out.println(cont);
			cont = cont - 1;
		} while (cont>=0);

	}

}
