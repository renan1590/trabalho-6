package projeto.teste;

import projeto.controller.ProdutosCadastro;
import projeto.controller.VendasRegistros;
import projeto.enums.FormaPagamentoEnum;
import projeto.model.Venda;

public class VendasTeste {
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
		
		VendasRegistros.init();
		
		Venda venda = new Venda();
		
		venda.setDesconto(2);
		
		venda.addProduto(6, 3);
		
		if (venda.fecharVenda(FormaPagamentoEnum.PIX)) {
			VendasRegistros.addVenda(venda);
		}
		
		venda = new Venda();
		
		venda.addProduto(4, 5);
		
		if (venda.fecharVenda(FormaPagamentoEnum.DINHEIRO)) {
			VendasRegistros.addVenda(venda);
		}
		
		VendasRegistros.listarVendas();
	}
}