import java.util.Scanner;

//Calculadora
public class Ex15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int op=0;
		
		do {
			System.out.println("**Calculadora**\n");
			System.out.println("*1-Somar");
			System.out.println("*2-Subtrair");
			System.out.println("*3-Multiplicar");
			System.out.println("*4-Dividir");
			System.out.println("*0-Sair\n");
			System.out.println("Digite a opção:\n");
			op =read.nextInt();
			switch(op) {
			case 1:{
			soma(read);
			break;
			}
			case 2:{
				int sub;
				sub = subtracao(read);
				System.out.println("Subtração = "+sub+"\n");
				break;
			}
			case 3:{
				int n1,n2;
				System.out.println("Número 1:");
				n1 = read.nextInt();
				System.out.println("Número 2:");
				n2 = read.nextInt();
				multiplicacao(n1,n2);
				break;
			}
			case 4:{
				int n1,n2;
				System.out.println("Número 1:");
				n1 = read.nextInt();
				System.out.println("Número 2:");
				n2 = read.nextInt();
				
				double div;
				div = divisao(n1,n2);
				System.out.println("Divisão = "+div+"\n");
				break;
			}default:{
				if(op!=0) {
					System.out.println("Opção inválida!\n");
				}
			}
			}
		}while(op!=0);{
			System.out.println("Fim do programa!");
		}

	}

	private static void soma(Scanner read) {
		int n1, n2;
		System.out.println("Número 1:");
		n1 = read.nextInt();
		System.out.println("Número 2:");
		n2 = read.nextInt();
		System.out.println("Soma = "+(n1+n2)+"\n");
		
	}

	private static int subtracao(Scanner read) {
		int n1,n2;
		System.out.println("Número 1:");
		n1 = read.nextInt();
		System.out.println("Número 2:");
		n2 = read.nextInt();
		return (n1-n2);
	}

	private static double divisao(int x, int y) {
		double d;
		d = x/y;
		return d;
	}

	private static void multiplicacao(int n1, int n2) {
		int mult;
		mult = n1*n2;
		System.out.println("Multiplição = "+mult+"\n");
		
	}

}
