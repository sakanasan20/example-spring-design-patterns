package tw.niq.example.structural.abstractfactory.factory;

import tw.niq.example.structural.abstractfactory.product.AbstractProductA;
import tw.niq.example.structural.abstractfactory.product.AbstractProductB;

public interface AbstractFactory {
	
	AbstractProductA createProductA();
	
	AbstractProductB createProductB();
	
}
