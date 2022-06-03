import java.util.Scanner;

/*Elabore um programa que calcule o IMC
 * (peso dividido pleo quadro da altura) e exiba os resultados de acordo com o
 * quadro abaixo.
 * Use estruturas de dicisão condicional para todos os casos.
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double peso, altura;
		
		//Lendo os valores do usuário
		System.out.println("Digite o peso: ");
		peso = read.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = read.nextDouble();
		
		double imc = (peso*peso)/altura;
	
		if (imc<18.5) {
			System.out.println("Abaixo do peso.\n"+imc);
		}else if(imc>=18.5&&imc<=24.9){
			System.out.println("Peso normal.\n"+imc);
		}else if(imc>=25&&imc<=29.9) {
			System.out.println("Sobrepeso.\n"+imc);
		}else if(imc>=30&&imc<=34.9) {
			System.out.println("Obesidade grau I.\n"+imc);
		}else if(imc>=35&&imc<=39.9) {
			System.out.println("Obesidade grau II\n"+imc);
		}else if(imc>=40) {
			System.out.println("Obesidade grau III\n"+imc);
		}else {
			System.out.println("Imc não se aplica!\n"+imc);
		}

	}

}
