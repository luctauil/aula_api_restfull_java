package com.lucastauil.apidemo.controller;

import com.lucastauil.apidemo.model.Cliente;
import com.lucastauil.apidemo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }
}
