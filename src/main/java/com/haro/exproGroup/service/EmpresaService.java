
package com.haro.exproGroup.service;

import com.haro.exproGroup.entity.Empresa;

import java.util.List;

public interface EmpresaService {
    Empresa registrarEmpresa(Empresa empresa);
    List<Empresa> obtenerUltimosTresRegistros();
}
