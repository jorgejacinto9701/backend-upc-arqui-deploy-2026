package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Comentario;

public interface ComentarioRepository 
		extends JpaRepository<Comentario, Integer>{

	
}
