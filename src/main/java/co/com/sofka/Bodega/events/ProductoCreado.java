package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.*;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoCreado extends DomainEvent {
    public ProductoCreado(IdProducto entityId, Nombre nombre, Precio precio, Stock stock, CodigoBarras codigoBarras, Seccion seccion, IdBodega idBodega) {
        super("sofka.bodega.productoCreado");
    }
}
