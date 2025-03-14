package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("tienda", 100.00);
	}

	@Test
	@DisplayName("Validación Método getPrecio")
	void testGetPrecio() {
		double valorEsperado = 100.00;
		double valorResultado = producto.getPrecio();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método setPrecio")
	void testSetPrecio() {
		double valorEsperado = 150.00;
		producto.setPrecio(valorEsperado);
		double valorResultado = producto.getPrecio();
		assertEquals(valorEsperado, valorResultado);
	}
	
	@Test
	@DisplayName("Validación Método setPrecio si un precio es negativo")
	void testSetPrecioNegativo() {
		double precioNegativo = -50.00;
		Exception exception = assertThrows(IllegalArgumentException.class, ()-> producto.setPrecio(precioNegativo)); //Este nuevo producto no se guarda en ningún lado / no se crea / se lanza la excepción
		String mensajeEsperado = "El precio no puede ser negativo: " + precioNegativo;
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	@Test
	@DisplayName("Validación Constructor negativo - Lanzar excepción")
	void testConstructor() {
		double precio = -100.00;
		//Objetio de tipo Exception (Excepción)
		Exception exception = assertThrows(IllegalArgumentException.class, ()->{new Producto("tienda", precio);});
		String mensajeEsperado = "El precio no puede ser negativo: " + precio;
		assertEquals(mensajeEsperado, exception.getMessage());
	}

	@Test
	@DisplayName("Validación Método getNombre")
	void testGetNombre() {
		String nombreEsperado = "tienda";
		String nombreResultado = producto.getNombre();
		assertEquals(nombreEsperado, nombreResultado);
	}
	
	@Test
	@DisplayName("Prueba de Validación del Método setNombre")
	void testSetNombre() {
		String nombreEsperado = "hamaca";
		producto.setNombre(nombreEsperado);
		String nombreResultado = producto.getNombre();
		assertEquals(nombreEsperado, nombreResultado);
	}
	
	/**
	 * @Test
	 * @DisplayName()
	 * void testCrearProductoValido(){
	 * 		String nombreEsperado = "tienda";
	 * 		double precioEsperado = 100.00;
	 * 
	 * 		assertEquals(nombreEsperado, producto.getNombre());
	 * 		assertEquals(nombreEsperado, producto.getPrecio());
	 */

}
