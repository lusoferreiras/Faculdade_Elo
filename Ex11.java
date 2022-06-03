import java.util.Scanner;

/*Elabore um exercício que leia e armazene em 
 *uma variável do tipo String. Usando uma estrutura
 *de repetição, leia outro texto do usuário e exiba 
 *a mensagem: "Senha Salva!". Usando uma estrutura de 
 *repetição com teste no final (Do while), leia outro
 *texto do usuário e compare com a senha informada 
 *anteriormente. O laço só encerra quando a senha digitada for 
 *igual. Exiba as mensagens: "Senha não confere, tente novamente!"
 *ou "Senhas Iguais", quando comparado.
 */
public class Ex11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String senha1, senha2;
		
		System.out.println("Senha: ");
		senha1 = read.next();
		System.out.println("Senha Salva!");
		
		do {
			System.out.println("Repita a senha: \n");
			senha2 = read.next();
			if(senha1.equals(senha2)){
				System.out.println("Senhas Iguais!\n");
			}else {
				System.out.println("Senha não confere, tente novamente.");
			}
		}while(!senha1.equals(senha2));
		System.out.println("Fim do programa!");

	}

}
