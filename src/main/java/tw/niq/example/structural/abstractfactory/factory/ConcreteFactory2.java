package tw.niq.example.structural.abstractfactory.factory;

import tw.niq.example.structural.abstractfactory.product.AbstractProductA;
import tw.niq.example.structural.abstractfactory.product.AbstractProductB;
import tw.niq.example.structural.abstractfactory.product.ConcreteProductA2;
import tw.niq.example.structural.abstractfactory.product.ConcreteProductB2;

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
