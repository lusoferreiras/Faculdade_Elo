package Aula11;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class principalConta {

	public static void main(String[] args) {
		Conta conta = new Conta(1, "Cliente1", 100);
		Conta ce = new ContaEmpresa(2, "Cliente2", 100, 1000);
		Conta cp = new ContaPoupanca(3, "Cliente3",100,0.1);
		
		//UPCASTING
		Conta cc1 = ce;
		cc1.saque(10);
		System.out.println();
		Conta cc2 = cp;
		cc2.saque(10);
		System.out.println(cc2.getSaldo());
		
		//DOWNCASTING
		ContaPoupanca contp = (ContaPoupanca) cp;
		Conta xconta = new ContaPoupanca(5,"Cliente5",100,0.1);
		
		if(xconta instanceof ContaPoupanca) {
			ContaPoupanca contap = (ContaPoupanca) xconta;
			//((ContaPoupanca) xconta).setTaxaJuros(0.1);
			((ContaPoupanca)xconta).renderJuros();
			System.out.println(xconta.getSaldo());
			System.out.println("É uma Conta Poupança!");
		}
		if(xconta instanceof ContaEmpresa) {
			ContaEmpresa xcontemp = (ContaEmpresa) xconta;
			xcontemp.saque(10);
			System.out.println(xcontemp.getSaldo());
			System.out.println("É uma Conta Empresa!");
		}

	}

}
