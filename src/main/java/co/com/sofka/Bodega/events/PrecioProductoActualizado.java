package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.Bodega.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioProductoActualizado extends DomainEvent {
    public PrecioProductoActualizado(IdProducto entityId, Precio precio) {
        super("sofka.bodega.productoCreado");
    }
}
