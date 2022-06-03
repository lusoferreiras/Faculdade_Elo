import java.util.Scanner;

/*Desenvolva um programa em java que receba 
 * como entrada o raio de uma circunferência
 * e imprima o diâmetro, a área e o comprimento
 * use uma constante chamada PI = 3,12159
 * Diâmetro = 2 * R
 * Circunferência = 2 * Pi * R
 * Área = Pi * RxR
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//Declarando Variáveis
		double raio;
		double pi = 3.14159;
		
		System.out.println("Raio: ");
		raio = read.nextDouble();
		
		//Calculando o Diâmetro
		double diametro = 2*raio;
		System.out.println("Diametro = "+diametro);
		
		//Calculando a Circunferência
		double cir = 2*pi*raio;
		System.out.println("Circunferência = "+cir);
		
		//Caculando a Área
		double area = pi*raio*raio;
		System.out.println("Área = "+area);
		

		read.close();
	}

}
