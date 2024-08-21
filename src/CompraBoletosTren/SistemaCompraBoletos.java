package CompraBoletosTren;

import java.util.Date;

public class SistemaCompraBoletos {
    public static void main(String[] args) {
        Tren tren = new Tren("001", "Ruta 1");
        Vagon vagonEconomico = new Vagon("Económica", 100);
        tren.agregarVagon(vagonEconomico);

        Viaje viaje = new Viaje(new Date(), "08:00", "10:00", tren);

        Cliente cliente = new Cliente("Juan Pérez", "12345678", "Calle Falsa 123");

        Asiento asiento = vagonEconomico.obtenerAsiento(1);
        asiento.reservar();

        Boleto boleto = new Boleto(cliente, viaje, asiento);
        cliente.agregarBoleto(boleto);

        System.out.println("Cliente: " + boleto.obtenerCliente().obtenerNombre());
        System.out.println("Viaje: " + boleto.obtenerViaje().obtenerFecha());
        System.out.println("Asiento: " + boleto.obtenerAsiento().obtenerNumero());
    }
}

