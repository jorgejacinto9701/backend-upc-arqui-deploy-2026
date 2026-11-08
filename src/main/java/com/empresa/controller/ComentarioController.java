package com.empresa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Comentario;
import com.empresa.service.ComentarioService;
import com.empresa.util.AppSettings;

@RestController
@RequestMapping("/url/comentario")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class ComentarioController {

    @Autowired
    private ComentarioService service;


    @GetMapping()
    public ResponseEntity<?> listaPorNombre(@PathVariable String filtro){
        List<Comentario> lista = service.listaComentario();
        return ResponseEntity.ok(lista);
    }

    @PostMapping()
    public ResponseEntity<?> registro(@RequestBody Comentario obj){
        HashMap<String, Object> salida = new HashMap<>();
        obj.setIdComentario(0);
        Comentario objSalida = service.inserta(obj);
        salida.put("data", objSalida);
        salida.put("mensaje", "Registro exitoso");
        return ResponseEntity.ok(salida);
    }


}
