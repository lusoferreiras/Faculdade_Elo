import java.util.Scanner;

/*Desenvolva um programa em java que receba 
 * como entrada o raio de uma circunfer�ncia
 * e imprima o di�metro, a �rea e o comprimento
 * use uma constante chamada PI = 3,12159
 * Di�metro = 2 * R
 * Circunfer�ncia = 2 * Pi * R
 * �rea = Pi * RxR
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//Declarando Vari�veis
		double raio;
		double pi = 3.14159;
		
		System.out.println("Raio: ");
		raio = read.nextDouble();
		
		//Calculando o Di�metro
		double diametro = 2*raio;
		System.out.println("Diametro = "+diametro);
		
		//Calculando a Circunfer�ncia
		double cir = 2*pi*raio;
		System.out.println("Circunfer�ncia = "+cir);
		
		//Caculando a �rea
		double area = pi*raio*raio;
		System.out.println("�rea = "+area);
		

		read.close();
	}

}
