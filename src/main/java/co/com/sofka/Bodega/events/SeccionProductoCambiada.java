package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.Bodega.values.Seccion;
import co.com.sofka.domain.generic.DomainEvent;

public class SeccionProductoCambiada extends DomainEvent {
    private final IdProducto entityId;
    private final Seccion seccion;

    public SeccionProductoCambiada(IdProducto entityId, Seccion seccion) {
        super("sofka.bodega.SeccionProductoCambiada");
        this.entityId = entityId;
        this.seccion = seccion;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Seccion getSeccion() {
        return seccion;
    }
}
