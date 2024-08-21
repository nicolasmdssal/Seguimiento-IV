package gestionDeProductos;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para modificar un producto
    public void modificarProducto(int index, Producto nuevoProducto) {
        if (index >= 0 && index < productos.size()) {
            productos.set(index, nuevoProducto);
        }
    }

    // Método para mostrar todos los productos
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.obtenerNombre());
            System.out.println("Descripción: " + producto.obtenerDescripcion());
            System.out.println("Precio: " + producto.obtenerPrecio());
            System.out.println("Stock: " + producto.obtenerStock());
            if (producto instanceof ProductoPerecedero) {
                System.out.println("Fecha de Vencimiento: " + ((ProductoPerecedero) producto).obtenerFechaVencimiento());
            }
            System.out.println("--------------------------------");
        }
    }
}

