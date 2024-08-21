package sistemaDeCredito;

public class credito {
    private SolicitudCredito solicitudCredito;
    private String estado;

    public credito(SolicitudCredito solicitudCredito) {
        this.solicitudCredito = solicitudCredito;
        this.estado = "pendiente";
    }

    public SolicitudCredito obtenerSolicitudCredito() {
        return solicitudCredito;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void aprobar() {
        estado = "aprobado";
    }

    public void rechazar() {
        estado = "rechazado";
    }
}
