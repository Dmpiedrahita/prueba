Prueba técnica Cadena

##Descripción

El presente proyecto hace referencia a una prueba técnica para la empresa Cadena, donde consta de un sistema de facturación para un posible restaurante, 
desarrollado en un lenguaje de programación JAVA, con ayuda del frameework Spring Boot y una base de datos MySQL, ejecutado por Daniel Muñetón Piedrahita.

## Prerrequisitos: Asegurarse de tener instalados los siquientes prerrequisitos en tu ambiente de desarrollo: 
				- Java Development Kit (JDK) 17 or higher. 
				- Maven.
				- MySQL y MySQL Workbench
				- Ejecutar Script BD

## Instalación: Para la instalación, seguir los siguientes pasos: 
				1. Descomprimir el archivo compartido con nombre cocinaConCadena.zip
				2. abrir una consola cmd y dirigirse a la ruta donde se encuentra el archivo descomprimido
				3. Compilar: mvn clean install 
				

## Ejecución:
			 1. Ejecutar comando de ejecución de jar: java -jar target/cocinaConCadena-0.0.1.jar
			 2. puerto usado: 8080. 
			 3. ENDPOINTS:	localhost:8080/home
					localhost:8080/cliente/maximos
					localhost:8080/factura/mes
					localhost:8080/factura/lista
					localhost:8080/factura/guardar

## Tecnologías y construcción 🛠️: 
				- Java 17
				- Springboot 3.2.2
				- MySQL y MySQL Workbench
				
				
__________________________________________________________________________________

Consideraciones:

- Login: No ejecutado
- Se muestra visualización con Thymeleaf y json
- Complicaciones de tiempo
- Inserción de facturas incompleta
- No se manejaron todas las excepciones
- Clientes consumo máximo: OK
- Facturas mes: 80%
- Se hacen inserciones a BD para ejecutar pruebas
- Dependencia de Loombok, con problemas de ejecución (Se conoce la funcionalidad)
