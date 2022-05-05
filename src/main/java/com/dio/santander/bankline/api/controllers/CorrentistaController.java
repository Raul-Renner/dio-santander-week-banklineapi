package com.dio.santander.bankline.api.controllers;

import com.dio.santander.bankline.api.service.CorrentistaService;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaService correntistaService;

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @GetMapping
    public List<Correntista> findAll(){
        return correntistaRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista novoCorrentista){
            correntistaService.save(novoCorrentista);
    }
}
