package tw.niq.example.creational.abstractfactory.demo;

import org.springframework.stereotype.Component;

import tw.niq.example.creational.abstractfactory.client.Client;
import tw.niq.example.creational.abstractfactory.factory.AbstractFactory;
import tw.niq.example.creational.abstractfactory.factory.ConcreteFactory1;
import tw.niq.example.creational.abstractfactory.factory.ConcreteFactory2;
import tw.niq.example.creational.abstractfactory.product.AbstractProductA;
import tw.niq.example.creational.abstractfactory.product.AbstractProductB;

@Component
public class AbstractFactoryDemo {

	public void start() {
		
		System.out.println("===== " + this.getClass().getSimpleName() + " =====");
		
		Client client = new Client();
		
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		AbstractProductA productA;
		AbstractProductB productB;
		
		productA = client.makeProductA(factory1);
		System.out.println(productA.getClass().getSimpleName());		
		
		productA = client.makeProductA(factory2);
		System.out.println(productA.getClass().getSimpleName());
		
		productB = client.makeProductB(factory1);
		System.out.println(productB.getClass().getSimpleName());
		
		productB = client.makeProductB(factory2);
		System.out.println(productB.getClass().getSimpleName());
	}
	
}
