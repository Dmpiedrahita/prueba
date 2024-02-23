package com.prueba.cocinaConCadena.repository;

import com.prueba.cocinaConCadena.entity.Camarero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamareroRepository extends JpaRepository<Camarero, Long> {

}
