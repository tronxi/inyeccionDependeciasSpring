package modelo.negocio;

import modelo.entidades.Coche;
import modelo.entidades.Opcion;

public class OpcionAdd extends Opcion{
	
	public OpcionAdd(String titulo) {
		super(titulo);
	}
	@Override
	public void ejecutar() {
		System.out.println("Introduce la marca");
		String marca = sc.next();
		System.out.println("Introduce el modelo");
		String modelo = sc.next();
		System.out.println("Introduce el color");
		String color = sc.next();
		Coche c = context.getBean("coche", Coche.class);
		c.setMarca(marca);
		c.setModelo(modelo);
		c.setColor(color);
		gc.add(c);
	}

}
