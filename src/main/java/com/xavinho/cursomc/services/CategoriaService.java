package com.xavinho.cursomc.services;

import com.xavinho.cursomc.domain.Categoria;
import com.xavinho.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository catRepository;

    public Categoria buscar(Integer id)
    {
        Optional<Categoria> cat = catRepository.findById(id);
        return cat.orElse(null);
    }

    public List<Categoria> listar()
    {
        List<Categoria> catList = catRepository.findAll();
        return catList;
    }
}
