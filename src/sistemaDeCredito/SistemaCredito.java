package sistemaDeCredito;

public class SistemaCredito {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "123456789", "Calle Falsa 123", "Buen historial", 50000);
        SolicitudCredito solicitud = new SolicitudCredito(cliente, "personal", 10000, 12, 5.5);
        credito credito = new credito(solicitud);

        System.out.println("Estado del crédito: " + credito.obtenerEstado());
        credito.aprobar();
        System.out.println("Estado del crédito después de aprobación: " + credito.obtenerEstado());

        // Para crédito hipotecario
        Propiedad propiedad = new Propiedad("Calle Real 456", 200000);
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(solicitud, propiedad);
        System.out.println("Propiedad del crédito hipotecario: " + creditoHipotecario.obtenerPropiedad().obtenerDireccion());
    }
}
