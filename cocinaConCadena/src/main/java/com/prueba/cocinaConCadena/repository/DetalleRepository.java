package com.prueba.cocinaConCadena.repository;

import com.prueba.cocinaConCadena.dto.DetalleDTO;
import com.prueba.cocinaConCadena.entity.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Long> {



}
