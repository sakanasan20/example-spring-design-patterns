package tw.niq.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tw.niq.example.creational.abstractfactory.demo.AbstractFactoryDemo;
import tw.niq.example.creational.builder.demo.BuilderDemo;

@SpringBootApplication
public class ExampleSpringDesignPatternsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExampleSpringDesignPatternsApplication.class, args);
		ctx.getBean(AbstractFactoryDemo.class).start();
		ctx.getBean(BuilderDemo.class).start();
	}

}
