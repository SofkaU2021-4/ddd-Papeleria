package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreProductoActualizado extends DomainEvent {
    private final IdProducto entityId;
    private final Nombre nombre;

    public NombreProductoActualizado(IdProducto entityId, Nombre nombre) {
        super("sofka.bodega.NombreProductoActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
