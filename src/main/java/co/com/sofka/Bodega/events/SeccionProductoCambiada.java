package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.Bodega.values.Seccion;
import co.com.sofka.domain.generic.DomainEvent;

public class SeccionProductoCambiada extends DomainEvent {
    public SeccionProductoCambiada(IdProducto entityId, Seccion seccion) {
        super("sofka.bodega.SeccionProductoCambiada");
    }
}
