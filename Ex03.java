import java.util.Scanner;

/*Elabore um programa em capaz de ler 2 n�meros reais do usu�rio,
 * calcular a m�dia e exibir a situa��o. Se o valor da m�dia for maior ou igual
 * a 7, exibir o texto: Aluno aprovado com m�dia: e a m�dia.
 * Se o valor da m�dia for menor que 7, exibir o texto: Aluno aprovado, 
 * com m�dia: e a m�dia.
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double nota1, nota2;
		
		//Preenchendo notas
		System.out.println("Digite nota 1: ");
		nota1 = read.nextDouble();
		System.out.println("Digite nota 2: ");
		nota2 = read.nextDouble();
		
		//Calcular m�dia
		double media = (nota1+nota2)/2;
		
		if(media>=0&&media<7) {
			System.out.println("Aluno Reprovado, com m�dia!\n"+media+" Nota final");
		}else if(media>7&&media<=10) {
			System.out.println("Aluno Aprovado, com m�dia!\n"+media+" Nota final");
		}else {
			System.out.println("Nota inv�lida!");
		}

	}

}
