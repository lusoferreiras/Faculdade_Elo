package Aula10;

public class principalConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(123,"Luan", 100);
		
		System.out.println(conta1);
		conta1.deposito(50);
		System.out.println(conta1);
		conta1.saque(20);
		System.out.println(conta1);
		
		System.out.println("Nome: "+conta2.getNomeCliente());
		System.out.println("Número: "+conta2.getNumero());
		System.out.println("Saldo: "+conta2.getSaldo());
		conta2.deposito(100);
		System.out.println("Saldo: "+conta2.getSaldo());
		conta2.saque(50);
		System.out.println("Saldo: "+conta2.getSaldo());
		
		ContaEmpresa ce = new ContaEmpresa(321,"Davi",7000,1000);
		System.out.println(ce);
		System.out.println("Limite: "+ce.getLimiteEmprestimo());
		ce.deposito(4000);
		System.out.println(ce);
		ce.saque(1000);
		System.out.println(ce);
		ce.emprestimo(2000);
		System.out.println(ce);
	}

}
