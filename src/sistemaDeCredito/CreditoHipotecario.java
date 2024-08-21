package sistemaDeCredito;

public class CreditoHipotecario extends credito{
    private Propiedad propiedad;

    public CreditoHipotecario(SolicitudCredito solicitudCredito, Propiedad propiedad) {
        super(solicitudCredito);
        this.propiedad = propiedad;
    }

    public Propiedad obtenerPropiedad() {
        return propiedad;
    }
}

