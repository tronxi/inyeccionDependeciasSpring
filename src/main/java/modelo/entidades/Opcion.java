package modelo.entidades;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.negocio.GestorCoche;

public abstract class Opcion {
	
	protected Scanner sc = new Scanner(System.in);
	
	private String titulo;
	

	@Autowired
	protected GestorCoche gc;
	
	protected static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	
	public abstract void ejecutar();
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	

}
