package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {
    public ProductoEliminado(IdProducto entityId) {
        super("sofka.bodega.productoEliminado");
    }
}
