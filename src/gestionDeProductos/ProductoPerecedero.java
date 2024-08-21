package gestionDeProductos;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    // Constructor
    public ProductoPerecedero(String nombre, String descripcion, double precio, int stock, String fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    // Método para obtener la fecha de vencimiento
    public String obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    // Método adicional para modificar la fecha de vencimiento
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
