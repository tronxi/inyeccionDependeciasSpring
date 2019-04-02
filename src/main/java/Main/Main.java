package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vista.VistaCoche;

public class Main {
public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	public static void main(String[] args) {
		context.getBean("vistaCoche", VistaCoche.class).arrancar();
	}

}
