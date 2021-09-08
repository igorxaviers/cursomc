package com.xavinho.cursomc.resources;

import com.xavinho.cursomc.domain.Categoria;
import com.xavinho.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource
{
    @Autowired
    private CategoriaService catService;

    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id)
    {
        Categoria cat = catService.buscar(id);
        return ResponseEntity.ok().body(cat);
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ResponseEntity<?> list()
    {
        List<Categoria> catList = catService.listar();
        return ResponseEntity.ok().body(catList);
    }
}

