package br.com.sgl.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Laboratorio> lista = new ArrayList<>();

	public void adiciona(Laboratorio lab) {
		lista.add(lab);		
	}
	
	public List<Laboratorio> getLaboratorios(){ 
        return Banco.lista;
    }

}
