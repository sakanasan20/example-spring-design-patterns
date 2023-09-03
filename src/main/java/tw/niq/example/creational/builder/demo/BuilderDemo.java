package tw.niq.example.creational.builder.demo;

import org.springframework.stereotype.Component;

import tw.niq.example.creational.builder.builder.ConcreteBuilder;
import tw.niq.example.creational.builder.director.Director;
import tw.niq.example.creational.builder.product.Product;

@Component
public class BuilderDemo {

	public void start() {
		
		System.out.println("===== " + this.getClass().getSimpleName() + " =====");
		
		ConcreteBuilder concreteBuilder = new ConcreteBuilder();
		
		Director director = new Director(concreteBuilder);
		
		Product lowEndproduct = director.constructLowEnd();
		System.out.println(lowEndproduct);
		
		Product highEndproduct = director.constructHighEnd();
		System.out.println(highEndproduct);
		
		
		
	}
	
}
