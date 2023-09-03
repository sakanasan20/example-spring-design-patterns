package tw.niq.example.creational.builder.director;

import tw.niq.example.creational.builder.builder.ConcreteBuilder;
import tw.niq.example.creational.builder.product.Product;

public class Director {
	
	private ConcreteBuilder concreteBuilder;
	
	public Director(ConcreteBuilder concreteBuilder) {
		this.concreteBuilder = concreteBuilder;
	}
	
	public Product constructLowEnd() {
		return concreteBuilder
				.buildPart1(new Product.Part1("Low-end"))
				.buildPart2(new Product.Part2("Low-end"))
				.buildPart3(new Product.Part3("Low-end"))
				.getResult();
	}
	
	public Product constructHighEnd() {
		return concreteBuilder
				.buildPart1(new Product.Part1("High-end"))
				.buildPart2(new Product.Part2("High-end"))
				.buildPart3(new Product.Part3("High-end"))
				.getResult();
	}
	
}
