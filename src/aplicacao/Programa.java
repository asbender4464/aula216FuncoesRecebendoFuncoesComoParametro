package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;
import modelo.servicos.ProdutoServico;

public class Programa {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();

		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));

		ProdutoServico ps = new ProdutoServico();
		
		double sum = ps.somaFiltrada(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Soma de preços dos produtos que começam com 'T' = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> p.getName().charAt(0) == 'M');
		System.out.println("Soma de preços dos produtos que começam com 'M' = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> p.getPrice() > 300.0);
		System.out.println("Soma de preços dos produtos com valor maior que $300 = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> p.getPrice() < 300.0);
		System.out.println("Soma de preços dos produtos com valor menor que $300 = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> ((p.getPrice() > 50.0)) && (p.getPrice() < 360.0));
		System.out.println("Soma de preços dos produtos com valor entre $50 e $360 = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> p.getPrice() < 50.0);
		System.out.println("Soma de preços dos produtos com valor menor que $50 = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> p.getPrice() > 900.0);
		System.out.println("Soma de preços dos produtos com valor maior que $900 = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> p.getName().charAt(0) == 'A');
		System.out.println("Soma de preços dos produtos que começam com 'A' = " + String.format("%.2f", sum));
		
		sum = ps.somaFiltrada(list, p -> ((p.getPrice() < 50.0)) || (p.getName().charAt(1) == 'o'));
		System.out.println("Soma de preços dos produtos com valor menor que $50 OU cuja segunda letra é 'o' = " + String.format("%.2f", sum));
	}
}