package ejercicio6;
import java.util.ArrayList;

class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado correctamente.");
    }

    public void eliminarLibro(String ISBN) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getISBN().equals(ISBN)) {
                libros.remove(i);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con ese título.");
        }
    }

    public void buscarLibroPorAutor(String autor) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
