package Aula11;

public class ContaPoupanca extends Conta {
	public double taxajuros;

	
	public ContaPoupanca(int numero, String nomeCliente, double saldo, double taxajuros) {
		super(numero, nomeCliente, saldo);
		this.taxajuros = taxajuros;
	}


	public double getTaxajuros() {
		return taxajuros;
	}


	public void setTaxajuros(double taxajuros) {
		this.taxajuros = taxajuros;
	}
	
	public void renderJuros() {
		double novoSaldo = getSaldo()+getSaldo()*taxajuros;
		setSaldo(novoSaldo);
	}
	
	

}
