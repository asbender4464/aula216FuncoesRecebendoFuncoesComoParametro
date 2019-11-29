package modelo.servicos;

import java.util.List;
import java.util.function.Predicate;

import entidades.Produto;

public class ProdutoServico {

	public double somaFiltrada(List<Produto> list, Predicate<Produto> criteria) {
		double sum = 0.0;
		for (Produto p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}