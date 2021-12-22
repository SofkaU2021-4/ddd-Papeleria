package co.com.sofka.Factura.events;

import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioEliminado extends DomainEvent {
    private final IdServicio idServicio;

    public ServicioEliminado(IdServicio idServicio) {
        super("sofka.factura.ServicioEliminado");
        this.idServicio = idServicio;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }
}
