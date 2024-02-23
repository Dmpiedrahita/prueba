package com.prueba.cocinaConCadena.repository;

import com.prueba.cocinaConCadena.entity.Camarero;
import com.prueba.cocinaConCadena.entity.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long> {

}
