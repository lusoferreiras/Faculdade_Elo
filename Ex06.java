/*Usando a estrutura de repeti��o Do While,
 * elabore um c�digo que imprima na tela os n�meros de 10 a 0. 
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
