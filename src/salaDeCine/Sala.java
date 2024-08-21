package salaDeCine;

public class Sala {
    private int numero;
    private int capacidad;
    private Asiento[][] listaAsientos;

    public Sala(int numero, int filas, int columnas) {
        this.numero = numero;
        this.capacidad = filas * columnas;
        this.listaAsientos = new Asiento[filas][columnas];
        inicializarAsientos(filas, columnas);
    }

    private void inicializarAsientos(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                listaAsientos[i][j] = new Asiento(i + 1, j + 1);
            }
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        if (fila > 0 && fila <= listaAsientos.length && columna > 0 && columna <= listaAsientos[0].length) {
            return listaAsientos[fila - 1][columna - 1];
        }
        return null;
    }
}

