package com.kevinmoura.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmoura.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria c1 = new Categoria(1, "Informática");
		Categoria c2 = new Categoria(2, "Escritório");
		Categoria c3 = new Categoria(3, "Cozinha");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		return lista;
	}

}
