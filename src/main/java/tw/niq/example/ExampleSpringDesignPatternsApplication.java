package tw.niq.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tw.niq.example.structural.abstractfactory.demo.AbstractFactoryDemo;

@SpringBootApplication
public class ExampleSpringDesignPatternsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExampleSpringDesignPatternsApplication.class, args);
		ctx.getBean(AbstractFactoryDemo.class).start();
	}

}
