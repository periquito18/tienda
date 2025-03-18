package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {
	private Tienda tienda;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	
	@BeforeEach
	void setUp() throws Exception {
		//Dato "Tienda" -- iniciamos la lista vacía ¿?
		tienda = new Tienda();
		producto1 = new Producto("Portatil", 1200.00);
		producto2 = new Producto("Ratón", 25.00);
		producto3 = new Producto("Monitor", 200.00);
	}

	@Test
	@DisplayName("Probamos el método 'agregarProducto()' - Debería agregar productos a la tienda")
	void agregarProductosTest() {
		Integer totalEsperado = 3;
		//Añado 3 elementos
		tienda.agregarProducto(producto1);
		tienda.agregarProducto(producto2);
		tienda.agregarProducto(producto3);
		
		assertEquals(totalEsperado, tienda.obtenerProductos().size(), "No se corresponde el total de productos agregados con la longitud de la lista ¿?");
		//assertEquals("Portatil", tienda.obtenerProductos().size());
		
		//Producto producto1 = new Producto("cantimplora", 10.00);
		//productos.agregarProducto(producto1);
		//assertEquals("[" + producto1 + "]", productos.obtenerProductos());
	}
	
	@Test
	@DisplayName("Probamos el método 'obtenerProductos()' - Debería devolver los valores correctos")
	void valoresCorrectosTest() {
		tienda.agregarProducto(producto1);
		
		assertEquals("Portatil", tienda.obtenerProductos().get(0).getNombre(), "Se puede poner un mensaje (opcional)");
		assertEquals(1200.00, tienda.obtenerProductos().get(0).getPrecio(), "Se puede poner un mensaje (opcional)");
	}
	
	//@Test
	//@DisplayName("Probamos el método 'obtenerProductos()'")
	//void obtenerProductosTest() {	
	//}
	
	@Test
	@DisplayName("Probamos el método 'calcularPrecioTotal()'")
	void calcularPrecioTotalTest() {
		double totalEsperado = 1425.00;
		
		//Añado 3 elementos
		tienda.agregarProducto(producto1);
		tienda.agregarProducto(producto2);
		tienda.agregarProducto(producto3);
		
		assertEquals(totalEsperado, tienda.calcularPrecioTotal(), "La suma no es correcta");
	}

}
