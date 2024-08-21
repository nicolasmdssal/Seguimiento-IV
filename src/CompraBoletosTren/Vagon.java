package CompraBoletosTren;

import java.util.ArrayList;

public class Vagon {
    private String tipo;
    private int capacidad;
    private ArrayList<Asiento> listaAsientos;

    public Vagon(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>(capacidad);
        for (int i = 1; i <= capacidad; i++) {
            listaAsientos.add(new Asiento(i, "disponible"));
        }
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.obtenerNumero() == numero) {
                return asiento;
            }
        }
        return null;
    }
}


