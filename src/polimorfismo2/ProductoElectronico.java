
package polimorfismo2;


public class ProductoElectronico extends Producto {
    private int garantiaMeses;
    
    public ProductoElectronico(String codigo, String nombre, double precio, int garantiaMeses) {
        super(codigo, nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }
    
    public int getGarantiaMeses() {
        return garantiaMeses;
    }
    
    public double calcularPrecioDescuento() {
        return getPrecio() * 0.9; // descuento del 10% para productos electrónicos
    }
}

/* Observa que la clase "ProductoElectronico" implementa el método abstracto "calcularPrecioDescuento" 
según la regla de negocio definida para esta categoría de producto. */
