package Aula10;

public class Conta {
	
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	public Conta() {
		this.numero = 0;
		this.nomeCliente = "";
		this.saldo = 0.0;
	}
	
	public Conta(int numero, String nomeCliente, double saldo) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo+valor;
	}
	
	public void saque(double valor) {
		this.saldo = this.saldo-valor;
	}

	@Override
	public String toString() {
		String resp = "====================\n";
		resp +="Nome>>"+getNomeCliente()+
				"\n"+"Número>>"+getNumero()+
				"\n"+"Saldo>>"+getSaldo()+
				"\n"+"===================";
		return resp;
	}
	
	

}
