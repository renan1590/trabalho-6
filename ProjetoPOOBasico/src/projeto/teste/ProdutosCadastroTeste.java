package projeto.teste;

import projeto.controller.ProdutosCadastro;

public class ProdutosCadastroTeste {
	public static void main(String[] args) {
		ProdutosCadastro.init();
		
		ProdutosCadastro.inserirProduto(4, "Toddynho", 244, 213);
		ProdutosCadastro.inserirProduto(6, "Salsicha", 99, 88);
		ProdutosCadastro.listarTodos();
		ProdutosCadastro.inserirEstoquePorCodigo(4, 130);
		ProdutosCadastro.retirarEstoquePorCodigo(4, 200);
		ProdutosCadastro.listarTodos();
		ProdutosCadastro.listarTodos();
		ProdutosCadastro.alterarDescricaoPorDescricao("Toddynho", "Nescau");
		ProdutosCadastro.listarTodos();
	}
}