package br.com.desafiocdc.cdc.controller;

import br.com.desafiocdc.cdc.request.AutorRequest;
import br.com.desafiocdc.cdc.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorController{

    @Autowired
    private AutorService service;

    @PostMapping
    public Integer create(@RequestBody  AutorRequest autorRequest){
        service.create(autorRequest);
        return HttpStatus.OK.value();
    }
}
