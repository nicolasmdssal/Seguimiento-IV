package CompraBoletosTren;

public class Asiento {
    private int numero;
    private String estado;

    public Asiento(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void reservar() {
        if (estado.equals("disponible")) {
            estado = "reservado";
        }
    }

    public void ocupar() {
        if (estado.equals("reservado")) {
            estado = "ocupado";
        }
    }
}

