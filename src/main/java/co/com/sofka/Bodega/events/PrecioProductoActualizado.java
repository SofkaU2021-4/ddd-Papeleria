package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.Bodega.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioProductoActualizado extends DomainEvent {
    private final IdProducto entityId;
    private final Precio precio;

    public PrecioProductoActualizado(IdProducto entityId, Precio precio) {
        super("sofka.bodega.productoCreado");
        this.entityId = entityId;
        this.precio = precio;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
