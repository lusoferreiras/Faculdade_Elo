import java.util.Scanner;

/*Elabore um programa em capaz de ler 2 números reais do usuário,
 * calcular a média e exibir a situação. Se o valor da média for maior ou igual
 * a 7, exibir o texto: Aluno aprovado com média: e a média.
 * Se o valor da média for menor que 7, exibir o texto: Aluno aprovado, 
 * com média: e a média.
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
		
		//Calcular média
		double media = (nota1+nota2)/2;
		
		if(media>=0&&media<7) {
			System.out.println("Aluno Reprovado, com média!\n"+media+" Nota final");
		}else if(media>7&&media<=10) {
			System.out.println("Aluno Aprovado, com média!\n"+media+" Nota final");
		}else {
			System.out.println("Nota inválida!");
		}

	}

}
