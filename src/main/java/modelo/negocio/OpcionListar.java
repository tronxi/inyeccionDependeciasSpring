package modelo.negocio;

import modelo.entidades.Opcion;

public class OpcionListar extends Opcion{
	
	public OpcionListar(String titulo) {
		super(titulo);
	}
	@Override
	public void ejecutar() {
		System.out.println(gc.listar());
	}

}
