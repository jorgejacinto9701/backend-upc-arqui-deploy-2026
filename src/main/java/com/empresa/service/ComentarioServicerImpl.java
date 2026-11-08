package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Comentario;
import com.empresa.repository.ComentarioRepository;

@Service
public class ComentarioServicerImpl implements ComentarioService{

	@Autowired
	private ComentarioRepository repository;
	
	@Override
	public List<Comentario> listaComentario() {
		return repository.findAll();
	}

	@Override
	public Comentario inserta(Comentario obj) {
		return repository.save(obj);
	}

}
