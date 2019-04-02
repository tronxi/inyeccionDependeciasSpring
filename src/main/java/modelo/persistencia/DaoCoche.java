package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import modelo.entidades.Coche;

@Repository
public class DaoCoche {
	
	private List<Coche> listaCoches = new ArrayList<Coche>();
	
	public boolean add(Coche c) {
		return listaCoches.add(c);
	}
	
	public List<Coche> listar(){
		return listaCoches;
	}
}
