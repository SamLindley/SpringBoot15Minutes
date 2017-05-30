package com.psandchill.controller;

import com.psandchill.model.Piglet;
import com.psandchill.model.PigletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "piglets")
public class PigletController {

    @Autowired
    private PigletRepository pigletRepository;

    @GetMapping
    public Iterable<Piglet> findPiglets(){
        return pigletRepository.findAll();
    }

    @PostMapping(value = "/add")
    public Piglet addPiglet(@RequestBody Piglet piglet){
        return pigletRepository.save(piglet);
    }

}
