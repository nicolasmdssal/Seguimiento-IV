package ejercicio6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        //menu
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Buscar libro por autor");
            System.out.println("5. Listar libros");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anioPublicacion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    Libro libro = new Libro(titulo, autor, ISBN, anioPublicacion);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    System.out.print("Introduce el ISBN del libro a eliminar: ");
                    String ISBNEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(ISBNEliminar);
                    break;

                case 3:
                    System.out.print("Introduce el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    biblioteca.buscarLibroPorTitulo(tituloBuscar);
                    break;

                case 4:
                    System.out.print("Introduce el autor del libro a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    biblioteca.buscarLibroPorAutor(autorBuscar);
                    break;

                case 5:
                    biblioteca.listarLibros();
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
}
