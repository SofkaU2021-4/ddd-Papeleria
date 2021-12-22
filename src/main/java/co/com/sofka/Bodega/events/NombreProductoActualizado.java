package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreProductoActualizado extends DomainEvent {
    public NombreProductoActualizado(IdProducto entityId, Nombre nombre) {
        super("sofka.bodega.NombreProductoActualizado");
    }
}
