
package polimorfismo2;

import java.util.ArrayList;
import java.util.List;

/* Finalmente, creamos una clase llamada "GestorProductos" que utiliza el polimorfismo para trabajar con
productos de diferentes categorías de forma genérica, sin tener que conocer de antemano el tipo de 
producto que se está manejando: */



public class GestorProductos {
    private List<Producto> productos;
    
    public GestorProductos() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public double calcularTotalDescuentos() {
        double totalDescuentos = 0.0;
        for (Producto producto : productos) {
            totalDescuentos += producto.calcularPrecioDescuento();
        }
        return totalDescuentos;
    }
}
//* Observa que la clase "GestorProductos" recibe objetos de la clase "Producto" y los almacena en una lista sin importar de qué categoría sean. Luego, utiliza el método "calcularPrecioDescuento" de cada uno de estos productos para calcular el descuento aplicable y acumularlo en el total. */