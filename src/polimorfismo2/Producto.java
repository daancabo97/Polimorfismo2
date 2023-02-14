
package polimorfismo2;


/* Supongamos que tenemos una empresa que se dedica a la gestión de productos de distintas categorías, 
y que necesitamos tener una forma genérica de trabajar con estos productos, independientemente de su tipo.
Podemos utilizar el polimorfismo para lograr esto, definiendo una clase genérica de producto y luego 
extendiéndola con clases específicas para cada categoría de producto.*/

/* Primero, creamos una clase abstracta llamada "Producto" que define los atributos y métodos comunes a
todos los productos: */


public abstract class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public abstract double calcularPrecioDescuento();
}

/* Observa que esta clase es abstracta y tiene un método abstracto llamado "calcularPrecioDescuento".
Este método se implementará de forma diferente en cada una de las clases que extiendan de "Producto",
según la categoría de producto. */

/* Luego, creamos una clase llamada "ProductoElectronico" que extiende de "Producto" y que añade un 
atributo específico para productos electrónicos: */







