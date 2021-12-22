package co.com.sofka.Bodega.events;

import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionBodegueroCambiada extends DomainEvent {

    private final Direccion direccion;

    public DireccionBodegueroCambiada(Direccion direccion) {
        super("sofka.bodega.DireccionBodegueroCambiada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
