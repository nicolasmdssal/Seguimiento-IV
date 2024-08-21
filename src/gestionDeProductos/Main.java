package gestionDeProductos;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto producto1 = new Producto("Laptop", "Laptop Dell Inspiron", 1200.0, 10);
        ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("Leche", "Leche Entera", 2.5, 50, "2024-09-15");

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(productoPerecedero1);

        inventario.mostrarProductos();

        ProductoPerecedero productoPerecederoModificado = new ProductoPerecedero("Leche Deslactosada", "Leche Deslactosada Entera", 3.0, 30, "2024-10-01");
        inventario.modificarProducto(1, productoPerecederoModificado);

        System.out.println("Después de la modificación:");
        inventario.mostrarProductos();

        inventario.eliminarProducto(producto1);

        System.out.println("Después de la eliminación:");
        inventario.mostrarProductos();
    }
}

