package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {
    private final IdProducto entityId;

    public ProductoEliminado(IdProducto entityId) {
        super("sofka.bodega.productoEliminado");
        this.entityId = entityId;
    }

    public IdProducto getEntityId() {
        return entityId;
    }
}
