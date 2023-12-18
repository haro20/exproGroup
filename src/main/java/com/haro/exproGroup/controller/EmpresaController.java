package com.haro.exproGroup.controller;

import com.haro.exproGroup.entity.Empresa;
import com.haro.exproGroup.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://localhost:8080/empresa/registrar
//http://localhost:8080/empresa/ultimosTres
@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @PostMapping("/registrar")
    public Empresa registrarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.registrarEmpresa(empresa);
    }

    @GetMapping("/ultimosTres")
    public List<Empresa> obtenerUltimosTresRegistros() {
        return empresaService.obtenerUltimosTresRegistros();
    }
}

