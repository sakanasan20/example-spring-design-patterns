package tw.niq.example.creational.builder.builder;

import tw.niq.example.creational.builder.product.Product;

public abstract class Builder {

	protected Product product;
	
	public Builder() {
		this.product = new Product();
	}

	public abstract Builder buildPart1(Product.Part1 part1);
	
	public abstract Builder buildPart2(Product.Part2 part2);
	
	public abstract Builder buildPart3(Product.Part3 part3);
	
	public Product getResult() {
		return product;
	}
	
}
