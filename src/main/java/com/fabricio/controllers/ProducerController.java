package com.fabricio.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fabricio.services.ProducerService;

@Controller
public class ProducerController {

    @Autowired
    private ProducerService producerService;
    @PostMapping("/produce")
    @Transactional
    public void store(@RequestBody Dados dados){
        this.producerService.sendMessage(dados.message());
    }
}
