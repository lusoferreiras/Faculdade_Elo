package Aula10;

public class ContaEmpresa extends Conta {
	private double limiteEmprestimo;
	
	
	public ContaEmpresa(int numero, String nomeCliente, double saldo, double limiteEmprestimo) {
		super(numero, nomeCliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor<=this.limiteEmprestimo) {
			double novoSaldo;
			novoSaldo = getSaldo()+valor-10;
			setSaldo(novoSaldo);
			System.out.println("Empréstimo realiazado com sucesso!");
		}else {
			System.out.println("Valor ultrapassa seu limite de empréstimo!");
		}
	}

	@Override
	public String toString() {
		String r;
		r = super.toString();
		r+="\nLimite>>"+
				getLimiteEmprestimo()+"\n"+
				"===================";
		return r;
	}
	
	



}
