package com.prueba.cocinaConCadena.repository;

import com.prueba.cocinaConCadena.dto.FacturaDTO;
import com.prueba.cocinaConCadena.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

    @Query("SELECT new com.prueba.cocinaConCadena.dto.FacturaDTO(c.id, c.nombre, c.apellido, MONTHNAME(f.fecha), SUM(d.cantidad * p.precio)) " +
            "FROM Factura f " +
            "RIGHT JOIN f.camarero c " +
            "LEFT JOIN f.detalles d " +
            "LEFT JOIN d.plato p " +
            "GROUP BY c.id, c.nombre, c.apellido, MONTHNAME(f.fecha)" +
            "ORDER BY MONTHNAME(f.fecha) asc")
    List<FacturaDTO> facturasMes();

    @Query("SELECT new com.prueba.cocinaConCadena.dto.FacturaDTO(f.id, cl.nombre, cl.apellido, c.nombre, c.apellido, (d.cantidad * p.precio))" +
            "FROM Factura f " +
            "INNER JOIN f.camarero c " +
            "INNER JOIN f.detalles d "+
            "INNER JOIN d.plato p " +
            "INNER JOIN f.cliente cl " +
            "ORDER BY f.id")
    List<FacturaDTO> facturasTotal();


}
