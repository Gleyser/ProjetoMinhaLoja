package br.com.sgl.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Laboratorio> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Laboratorio lab1 = new Laboratorio();
		lab1.setId(chaveSequencial++);
		lab1.setNome("Alura");
		Laboratorio lab2 = new Laboratorio();
		lab2.setId(chaveSequencial++);
		lab2.setNome("Caelum");
		lista.add(lab1);
		lista.add(lab2);
	}

	public void adiciona(Laboratorio lab) {
		lista.add(lab);
	}

	public List<Laboratorio> getLaboratorios() {
		return Banco.lista;
	}

	public void removeLaboratorio(Integer id) {
		Iterator<Laboratorio> it = lista.iterator();

	    while(it.hasNext()) { 
	        Laboratorio emp = it.next();

	        if(emp.getId() == id ) {
	            it.remove();
	        }
	    }

	}
}
