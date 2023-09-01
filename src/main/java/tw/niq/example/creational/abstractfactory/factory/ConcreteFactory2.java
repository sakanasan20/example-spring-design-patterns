package tw.niq.example.creational.abstractfactory.factory;

import tw.niq.example.creational.abstractfactory.product.AbstractProductA;
import tw.niq.example.creational.abstractfactory.product.AbstractProductB;
import tw.niq.example.creational.abstractfactory.product.ConcreteProductA2;
import tw.niq.example.creational.abstractfactory.product.ConcreteProductB2;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}

}
