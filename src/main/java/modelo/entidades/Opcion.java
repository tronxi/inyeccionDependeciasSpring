package modelo.entidades;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.negocio.GestorCoche;

public abstract class Opcion {
	
	private String titulo;
	
	public Opcion(String titulo) {
		this.titulo = titulo;
	}
	
	@Autowired
	protected GestorCoche gc;
	
	protected static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	protected Scanner sc = new Scanner(System.in);

	
	public abstract void ejecutar();
	
	public String getTitulo() {
		return titulo;
	}
	
	

}
