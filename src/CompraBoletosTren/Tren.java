package CompraBoletosTren;

import java.util.ArrayList;

public class Tren {
    private String numero;
    private String ruta;
    private ArrayList<Vagon> listaVagones;

    public Tren(String numero, String ruta) {
        this.numero = numero;
        this.ruta = ruta;
        this.listaVagones = new ArrayList<>();
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public Vagon obtenerVagon(String tipo) {
        for (Vagon vagon : listaVagones) {
            if (vagon.obtenerTipo().equals(tipo)) {
                return vagon;
            }
        }
        return null;
    }

    public void agregarVagon(Vagon vagon) {
        listaVagones.add(vagon);
    }
}

