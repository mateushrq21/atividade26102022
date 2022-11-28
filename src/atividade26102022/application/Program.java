package atividade26102022.application;

import java.util.ArrayList;
import java.util.List;

import atividade26102022.entities.Aparelho;
import atividade26102022.entities.MaquinaLavarRoupa;
import atividade26102022.entities.Televisao;

public class Program {

	public static void main(String[] args) {
		
		List<Aparelho> carrinhoDeCompra = new ArrayList<Aparelho>();
		

		carrinhoDeCompra.add(new Aparelho(200.0, 20.0));
		carrinhoDeCompra.add(new Aparelho());
		carrinhoDeCompra.add(new Aparelho(800.0, "azul", 'B', 20.0));
		carrinhoDeCompra.add(new MaquinaLavarRoupa(500.0, "vermelho", 'C', 80.0, 13.0));
		carrinhoDeCompra.add(new MaquinaLavarRoupa(450.0, 5.0));
		carrinhoDeCompra.add(new MaquinaLavarRoupa());
		carrinhoDeCompra.add(new Televisao(2500.0, "preto", 'A', 3.0, 42.0, true));
		carrinhoDeCompra.add(new Televisao(890.0, 8.0));
		carrinhoDeCompra.add(new Televisao());
		carrinhoDeCompra.add(new Televisao(599.0, 11.0));
		
		double precoTotalCarrinho = 0.0;
		
		for (Aparelho item : carrinhoDeCompra) {
			System.out.println(item);
			precoTotalCarrinho+=item.getPrecoBase();
		}
		
		System.out.println();
		System.out.println("Preço total do carrinho: R$" + precoTotalCarrinho);
		
		
	}

}
