package tw.niq.example.creational.abstractfactory.client;

import tw.niq.example.creational.abstractfactory.factory.AbstractFactory;
import tw.niq.example.creational.abstractfactory.product.AbstractProductA;
import tw.niq.example.creational.abstractfactory.product.AbstractProductB;

public class Client {

	public AbstractProductA makeProductA(AbstractFactory factory) {
		 return factory.createProductA();
	}
	
	public AbstractProductB makeProductB(AbstractFactory factory) {
		 return factory.createProductB();
	}
	
}
