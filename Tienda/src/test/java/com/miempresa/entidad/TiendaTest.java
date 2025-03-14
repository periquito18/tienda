package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {
	private Tienda productos;
	
	@BeforeEach
	void setUp() throws Exception {
		//Dato "Tienda" -- iniciamos la lista vacía ¿?
		productos = new Tienda();
	}

	@Test
	@DisplayName("Probamos el método 'agregarProducto()'")
	void agregarProductosTest() {
		Producto producto1 = new Producto("cantimplora", 10.00);
		productos.agregarProducto(producto1);
		assertEquals("[" + producto1 + "]", productos.obtenerProductos());
	}
	
	@Test
	@DisplayName("Probamos el método 'obtenerProductos()'")
	void obtenerProductosTest() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Probamos el método 'calcularPrecioTotal()'")
	void calcularPrecioTotalTest() {
		fail("Not yet implemented");
	}

}
