package salaDeCine;

public class SistemaCine {
    public static void main(String[] args) {
        // Crear una sala
        Sala sala1 = new Sala(1, 5, 5); // Sala 1 con 5 filas y 5 columnas de asientos

        // Crear una función
        Funcion funcion1 = new Funcion("Pelicula A", "18:00", sala1, 10.0);

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan Perez", "12345678", "Calle Falsa 123");

        // Crear una reserva
        Reserva reserva1 = new Reserva(cliente1, funcion1);

        // Reservar asientos
        Asiento asiento1 = sala1.obtenerAsiento(1, 1);
        Asiento asiento2 = sala1.obtenerAsiento(1, 2);
        reserva1.agregarAsiento(asiento1);
        reserva1.agregarAsiento(asiento2);

        // Agregar la reserva al historial del cliente
        cliente1.agregarReserva(reserva1);

        // Mostrar el estado de los asientos reservados
        for (Asiento asiento : reserva1.obtenerListaAsientos()) {
            System.out.println("Asiento reservado: Fila " + asiento.obtenerFila() + ", Columna " + asiento.obtenerColumna());
        }
    }
}

