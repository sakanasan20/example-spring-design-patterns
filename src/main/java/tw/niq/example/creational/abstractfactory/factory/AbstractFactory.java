package tw.niq.example.creational.abstractfactory.factory;

import tw.niq.example.creational.abstractfactory.product.AbstractProductA;
import tw.niq.example.creational.abstractfactory.product.AbstractProductB;

public interface AbstractFactory {
	
	AbstractProductA createProductA();
	
	AbstractProductB createProductB();
	
}
