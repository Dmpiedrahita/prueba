-- Usuario

CREATE USER `prueba`@`%` IDENTIFIED BY `prueba`

-- Permisos

GRANT ALL PRIVILEGES ON * . * TO `prueba`@`%`;

-- DATABASE

DROP DATABASE `cadena`;

CREATE DATABASE  IF NOT EXISTS `cadena`;
USE `cadena`;

--
-- Tablas
--

SHOW DATABASES;

CREATE TABLE `MESAS` (
  `id_mesa` int NOT NULL AUTO_INCREMENT,
  `max_comensales` int NOT NULL,
  `ubicacion` varchar(45) NOT NULL,
  PRIMARY KEY (`id_mesa`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `CLIENTES` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(45) NOT NULL,
  `apellido_cliente` varchar(45) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `CAMAREROS` (
  `id_camarero` int NOT NULL AUTO_INCREMENT,
  `nombre_camarero` varchar(45) NOT NULL,
  `apellido_camarero` varchar(45) NOT NULL,
  PRIMARY KEY (`id_camarero`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `PLATOS` (
  `id_plato` int NOT NULL AUTO_INCREMENT,
  `nombre_plato` varchar(45) NOT NULL,
  `precio` float NOT NULL,
  PRIMARY KEY (`id_plato`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `FACTURAS`  (
  `id_factura` int NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `id_camarero` int,
  `id_cliente` int,
  `id_mesa` int,
  PRIMARY KEY (`id_factura`),
  FOREIGN KEY (`id_camarero`) REFERENCES `CAMAREROS` (`id_camarero`),
  FOREIGN KEY (`id_cliente`) REFERENCES `CLIENTES` (`id_cliente`),
  FOREIGN KEY (`id_mesa`) REFERENCES `MESAS` (`id_mesa`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `DETALLES` (
  `id_detalle` int NOT NULL AUTO_INCREMENT,
  `cantidad` int NOT NULL,
  `id_plato` int,
  `id_factura` int
  PRIMARY KEY (`id_detalle` ),
  FOREIGN KEY (`id_plato`) REFERENCES `PLATOS` (`id_plato`)
  FOREIGN KEY (`id_factura`) REFERENCES `FACTURAS` (`id_factura`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO CLIENTES VALUES (1, 'cliente1', 'cliente1');
INSERT INTO CLIENTES VALUES ( 2, 'cliente2', 'cliente2');

INSERT INTO CAMAREROS VALUES (1, 'camarero1', 'camarero1');
INSERT INTO CAMAREROS VALUES ( 2, 'camarero2', 'camarero2');

INSERT INTO PLATOS VALUES ( 1, 'plato1', 15000);
INSERT INTO PLATOS VALUES ( 2, 'plato2', 25000);
INSERT INTO PLATOS VALUES ( 3, 'plato5', 5000);

INSERT INTO MESAS VALUES (1, 'frente');
INSERT INTO MESAS VALUES (2, 'lateral');

INSERT INTO FACTURAS VALUES(1, '2024-01-03', 1, 1, 1);
INSERT INTO FACTURAS VALUES(2, '2024-01-03', 1, 2, 1);
INSERT INTO FACTURAS VALUES(3, '2024-01-03', 1, 2, 2);
INSERT INTO FACTURAS VALUES(4, '2024-02-04', 2, 1, 1);
INSERT INTO FACTURAS VALUES(5, '2024-02-04', 2, 1, 1);
INSERT INTO FACTURAS VALUES(6, '2024-02-04', 2, 2, 2);
INSERT INTO FACTURAS VALUES(7, '2024-02-05', 2, 1, 2);
INSERT INTO FACTURAS VALUES(8, '2024-01-05', 2, 2, 2);

INSERT INTO DETALLES VALUES(1, 1, 1, 1);
INSERT INTO DETALLES VALUES(2, 2, 1, 1);
INSERT INTO DETALLES VALUES(3, 3, 3, 3);
INSERT INTO DETALLES VALUES(4, 2, 1, 2);
INSERT INTO DETALLES VALUES(5, 1, 1, 1);
INSERT INTO DETALLES VALUES(6, 2, 1, 1);
INSERT INTO DETALLES VALUES(7, 3, 3, 2);
INSERT INTO DETALLES VALUES(8, 2, 1, 3);
INSERT INTO DETALLES VALUES(9, 1, 1, 4);
INSERT INTO DETALLES VALUES(10, 2, 1, 5);
INSERT INTO DETALLES VALUES(11, 3, 3, 5);
INSERT INTO DETALLES VALUES(12, 2, 1, 6);
INSERT INTO DETALLES VALUES(13, 1, 1, 6);
INSERT INTO DETALLES VALUES(14, 2, 1, 7);
INSERT INTO DETALLES VALUES(15, 3, 3, 7);
INSERT INTO DETALLES VALUES(16, 2, 1, 2);


SELECT * FROM FACTURAS;
SELECT * FROM DETALLES;
SELECT * FROM CLIENTES;
SELECT * FROM MESAS;
SELECT * FROM CAMAREROS;
SELECT * FROM PLATOS;

SELECT * FROM CLIENTES AS CL
INNER JOIN FACTURAS AS FA ON CL.id_cliente = FA.id_cliente


SELECT CL.id_cliente, CL.nombre_cliente, CL.apellido_cliente, SUM(round(DE.cantidad * PL.precio)) AS Total FROM CLIENTES CL
INNER JOIN FACTURAS FA ON CL.id_cliente = FA.id_cliente
INNER JOIN DETALLES DE ON DE.id_factura = FA.id_factura
INNER JOIN PLATOS PL ON PL.id_plato = DE.id_plato
GROUP BY CL.id_cliente
HAVING SUM(round(DE.cantidad * PL.precio)) > 100000;

SELECT c.nombre_camarero, c.apellido_camarero, 
MONTH(F.fecha) AS Mes,
SUM(D.cantidad * P.precio) AS Total 
FROM CAMAREROS c
LEFT JOIN FACTURAS F ON F.ID_CAMARERO = C.ID_CAMARERO
LEFT JOIN DETALLES AS D ON F.id_factura = D.id_factura
LEFT JOIN PLATOS AS P ON D.id_plato = P.id_plato
GROUP BY c.nombre_camarero, c.apellido_camarero, Mes;

SELECT F.id_factura, CL.nombre_cliente, CL.apellido_cliente, C.nombre_camarero, C.apellido_camarero, MONTHNAME(f.fecha), round(P.precio * D.cantidad) AS Total
FROM CAMAREROS c
INNER JOIN FACTURAS F ON F.ID_CAMARERO = C.ID_CAMARERO
INNER JOIN DETALLES AS D ON F.id_factura = D.id_factura
INNER JOIN PLATOS AS P ON D.id_plato = P.id_plato
INNER JOIN CLIENTES AS CL ON CL.id_cliente = F.id_cliente
ORDER BY F.id_factura;











