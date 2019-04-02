package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import modelo.entidades.Opcion;

@Component
public class VistaCoche {

	private Scanner sc = new Scanner(System.in);
	 
	@Autowired
	private List<Opcion> listaOpciones;
	
	public void arrancar() {
		int opcion;
		do {
			opcion = mostrarOpciones();
			if(opcion != 0) {
				listaOpciones.get(opcion-1).ejecutar();
			}
			
		}while(opcion != 0);
	}
	
	private int mostrarOpciones() {
		System.out.println("Elige una opcion");
		System.out.println("0- salir");
		for(int i = 0; i < listaOpciones.size(); i++) {
			System.out.println(i+1 + "- " + listaOpciones.get(i).getTitulo());
		}
		return sc.nextInt();
	}

}
