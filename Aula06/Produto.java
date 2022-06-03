package Aula06;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	private int vida;
	
	//Construtor sem parâmetros
	public Produto() {
		nome = "-";
		preco = 0.0;
		quantidade = 0;
		vida = 100;
	}
	
	//Construtor com parâmetros/argumentos
	Produto(String n, int qtd){
		nome = n;
		quantidade = qtd;
	}
	public void addProdutos(int qtd) {
		quantidade = quantidade +qtd;
	}
	public void removerProdutos(int qtd) {
		quantidade = quantidade + qtd;
	}
	public double valorTotalEstoque() {
		double vte = this.preco*this.quantidade;
		return vte;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void serQuantidade(int novoQuantidade) {
		this.quantidade = novoQuantidade;
		
	}

}
