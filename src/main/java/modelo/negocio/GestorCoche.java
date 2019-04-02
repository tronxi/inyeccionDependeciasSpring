package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Coche;
import modelo.persistencia.DaoCoche;

@Service
public class GestorCoche {
	
	@Autowired
	private DaoCoche daoCoche;
	
	public boolean add(Coche c) {
		return daoCoche.add(c);
	}
	
	public List<Coche> listar(){
		return daoCoche.listar();
	}
	
}
