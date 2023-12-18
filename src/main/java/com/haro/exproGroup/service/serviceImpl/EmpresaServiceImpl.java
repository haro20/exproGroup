package com.haro.exproGroup.service.serviceImpl;

import com.haro.exproGroup.entity.Empresa;
import com.haro.exproGroup.repository.EmpresaRepository;
import com.haro.exproGroup.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Empresa registrarEmpresa(Empresa empresa) {
        // Lógica para registrar la empresa en la base de datos
        return empresaRepository.save(empresa);
    }

    @Override
    public List<Empresa> obtenerUltimosTresRegistros() {
        // Lógica para obtener los 3 últimos registros de empresas
        List<Empresa> empresas = empresaRepository.findAll();
        int size = empresas.size();
        if (size > 3) {
            return empresas.subList(size - 3, size);
        } else {
            return empresas;
        }
    }
}
