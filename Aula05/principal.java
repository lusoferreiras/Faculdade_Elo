package Aula05;

import java.util.Date;

public class principal {

	public static void main(String[] args) {
		Livro li = new Livro();
		
		li.anoLancamento = 2020;
		li.autor = "Luan Ferreira";
		li.isbn = 123;
		li.nome = "Introdução a POO";
		li.qtdPaginas = 100;
		
		System.out.println("Livro");
		System.out.println("Nome: "+li.nome);
		System.out.println("Autor: "+li.autor);
		System.out.println("ISBN: "+li.isbn);
		
		livroLivraria ll = new livroLivraria();
		ll.preco = 100;
		ll.autor = "Plinio";
		ll.qtdPaginas = 200;
		
		System.out.println("Livro Livraria");
		System.out.println("Autor: "+ll.autor);
		System.out.println("Preço: "+ll.preco);
		
		livroBiblioteca lb = new livroBiblioteca();
		lb.autor = "Luan";
		lb.data = new Date();
		lb.emprestimo = true;
		lb.idUsuario = 123;
		
		System.out.println("Livro Biblioteca");
		System.out.println("Autor: "+lb.autor);
		System.out.println("Data: "+lb.data);
		System.out.println("Emprestimo? "+lb.emprestimo);
		System.out.println("Código Usuário: "+lb.idUsuario);

	}

}
