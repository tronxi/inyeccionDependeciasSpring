package modelo.negocio;

import modelo.entidades.Opcion;

public class OpcionListar extends Opcion{
	@Override
	public void ejecutar() {
		System.out.println(gc.listar());
	}

}
