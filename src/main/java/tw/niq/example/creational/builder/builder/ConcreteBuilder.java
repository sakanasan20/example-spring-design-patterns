package tw.niq.example.creational.builder.builder;

import tw.niq.example.creational.builder.product.Product;
import tw.niq.example.creational.builder.product.Product.Part1;
import tw.niq.example.creational.builder.product.Product.Part2;
import tw.niq.example.creational.builder.product.Product.Part3;

public class ConcreteBuilder extends Builder {
	
	public ConcreteBuilder() {
		super();
	}

	@Override
	public Builder buildPart1(Part1 part1) {
		this.product.setPart1(part1);
		return this;
	}

	@Override
	public Builder buildPart2(Part2 part2) {
		this.product.setPart2(part2);
		return this;
	}

	@Override
	public Builder buildPart3(Part3 part3) {
		this.product.setPart3(part3);
		return this;
	}

	@Override
	public Product getResult() {
		return super.getResult();
	}

}
