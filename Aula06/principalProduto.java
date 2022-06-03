package Aula06;

public class principalProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		Produto p2 = new Produto("pneu",10);
		p2.setNome("capacete");
		p2.setPreco(500);
		p2.serQuantidade(2);
		
		System.out.println(p2.getNome());
		System.out.println(p2.getPreco());
		System.out.println(p2.getQuantidade());

	}

}
