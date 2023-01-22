package br.com.desafiocdc.cdc.service;

import br.com.desafiocdc.cdc.entity.Autor;
import br.com.desafiocdc.cdc.repository.AutorRepository;
import br.com.desafiocdc.cdc.request.AutorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorService {

    @Autowired
    AutorRepository repository;

    @Transactional
    public void create(AutorRequest autorRequest){
        Autor autor = autorRequest.toModel();
        repository.save(autor);
    }
}
