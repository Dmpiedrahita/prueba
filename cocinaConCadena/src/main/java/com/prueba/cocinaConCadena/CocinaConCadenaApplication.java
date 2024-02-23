package com.prueba.cocinaConCadena;

import com.prueba.cocinaConCadena.dao.FacturaDAO;
import com.prueba.cocinaConCadena.dao.MesaDAO;
import com.prueba.cocinaConCadena.entity.Mesa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CocinaConCadenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CocinaConCadenaApplication.class, args);
	}

/*	@Bean
	public CommandLineRunner commandLineRunner(FacturaDAO facturaDao){
		return runner ->{
			//createMesa(mesaDao);
			//leerMesas(mesaDao);
			//crearFacturas(facturaDao);
		};
	}

	private void crearFacturas(FacturaDao facturaDao) {
		Factura factura = new Factura()
	}*/

	/*private void leerMesas(MesaDAO mesaDao) {
		List<Mesa> mesas = mesaDao.findAll();
		for(Mesa mesa : mesas){
			System.out.println(mesa);
		}
	}

	private void createMesa(MesaDAO mesaDao) {
		Mesa newMesa = new Mesa(4, "Frente");
		mesaDao.save(newMesa);
		System.out.println("Mesa creada");
	}*/

}
