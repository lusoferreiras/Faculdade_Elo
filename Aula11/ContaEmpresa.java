package Aula11;

public class ContaEmpresa extends Conta{
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
	
	public void saque(double valor) {
		double novosaldo = getSaldo()-valor-10;
		setSaldo(novosaldo);
	}
	
	public void novoMetodo() {
		System.out.println("novo!");
	}
	
	public void emprestimo(double valor) {
		if(valor<=this.limiteEmprestimo) {
			double Saldonovo;
			Saldonovo = getSaldo()+valor-10;
			setSaldo(Saldonovo);
			System.out.println("Empréstimo realizado com sucesso!");
		}else {
			System.out.println("Valor ultrapassa seu limite de Empréstimo!");
		}
	}
	
	@Override
	public String toString() {
		String r;
		r = super.toString();
		r+="\nLimite"+getLimiteEmprestimo()+"\n"+"==================\n";
		
		return r;
	}

}
