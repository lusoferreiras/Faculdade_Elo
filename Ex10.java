import java.util.Scanner;

/*Utilizando as estruturas switch e case, elabore 
 * um programa que exiba as mensagens de acordo com
 * a tabela abaixo: 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		//Declara��o de vari�veis
		Scanner read = new Scanner(System.in);
		int opcao;
		
		//Menu
		System.out.println("***MENU DO CLIENTE***");
		System.out.println("1-Cadastrar cliente \n");
		System.out.println("2-Editar Cliente \n");
		System.out.println("3-remover cliente \n");
		opcao = read.nextInt();
		
		switch(opcao) {
		case 1:{
			System.out.println("Entrou no menu do Cadastro...");
			break;
		}
		case 2 :{
			System.out.println("Entrou no menu de Edi��o...");
			break;
		}
		case 3:{
			System.out.println("Entrou no menu de Remo��o...");
			break;
		}
		default:{
			System.out.println("Op��o inv�lida!");
			break;
		}
		}
		read.close();
	}

}
