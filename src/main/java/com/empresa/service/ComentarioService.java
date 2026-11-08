package com.empresa.service;

import java.util.List;

import com.empresa.entity.Comentario;

public interface ComentarioService {

	public List<Comentario> listaComentario();
	public Comentario inserta(Comentario obj);
}
