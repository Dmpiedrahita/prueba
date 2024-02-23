package com.prueba.cocinaConCadena.repository;

import com.prueba.cocinaConCadena.dto.ClienteDTO;
import com.prueba.cocinaConCadena.entity.Cliente;
import com.prueba.cocinaConCadena.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT new com.prueba.cocinaConCadena.dto.ClienteDTO(c.id, c.nombre, c.apellido, SUM(d.cantidad * p.precio)) " +
            "FROM Cliente c " +
            "INNER JOIN c.facturas f " +
            "INNER JOIN f.detalles d " +
            "INNER JOIN d.plato p " +
            "GROUP BY c.id " +
            "HAVING SUM(d.cantidad * p.precio) > 100000")
    List<ClienteDTO> findMaxClients();



}
