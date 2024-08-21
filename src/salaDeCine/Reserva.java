package salaDeCine;

import java.util.ArrayList;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private ArrayList<Asiento> listaAsientos;

    public Reserva(Cliente cliente, Funcion funcion) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = new ArrayList<>();
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Funcion obtenerFuncion() {
        return funcion;
    }

    public ArrayList<Asiento> obtenerListaAsientos() {
        return listaAsientos;
    }

    public void agregarAsiento(Asiento asiento) {
        if (asiento.obtenerEstado().equals("disponible")) {
            asiento.reservar();
            listaAsientos.add(asiento);
        }
    }
}

