package tw.niq.example.structural.abstractfactory.client;

import tw.niq.example.structural.abstractfactory.factory.AbstractFactory;
import tw.niq.example.structural.abstractfactory.product.AbstractProductA;
import tw.niq.example.structural.abstractfactory.product.AbstractProductB;

public class Client {

	public AbstractProductA makeProductA(AbstractFactory factory) {
		 return factory.createProductA();
	}
	
	public AbstractProductB makeProductB(AbstractFactory factory) {
		 return factory.createProductB();
	}
	
}
