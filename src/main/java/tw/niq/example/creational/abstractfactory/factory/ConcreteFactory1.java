package tw.niq.example.creational.abstractfactory.factory;

import tw.niq.example.creational.abstractfactory.product.AbstractProductA;
import tw.niq.example.creational.abstractfactory.product.AbstractProductB;
import tw.niq.example.creational.abstractfactory.product.ConcreteProductA1;
import tw.niq.example.creational.abstractfactory.product.ConcreteProductB1;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}

}
