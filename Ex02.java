import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("N�mero 1: ");
		num1 = read.nextInt();
		
		System.out.println("N�mero 2: ");
		num2 = read.nextInt();
		
		if(num1>num2) {
			System.out.println("O n�mero 1 � o maior!\n"+num1);
		}else if(num2>num1) {
			System.out.println("O n�mero 2 � o maior!\n"+num2);
		}else {
			System.out.println("Os n�meros s�o iguais: "+num1);
		}

	}

}
