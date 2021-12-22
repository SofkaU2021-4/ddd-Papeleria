package co.com.sofka.Factura.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ServicioAgregado extends DomainEvent {
    private final String servicio;
    private final Long valor;

    public ServicioAgregado(String servicio, Long valor) {
        super("sofka.factura.ServicioAgregado");
        this.servicio = servicio;
        this.valor = valor;
    }
}
