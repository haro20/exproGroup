
package com.haro.exproGroup.repository;

import com.haro.exproGroup.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    // consultas personalizadas si es necesario
}
