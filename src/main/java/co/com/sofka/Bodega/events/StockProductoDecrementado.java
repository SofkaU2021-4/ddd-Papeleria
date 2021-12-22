package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.Bodega.values.Stock;
import co.com.sofka.domain.generic.DomainEvent;

public class StockProductoDecrementado extends DomainEvent {
    public StockProductoDecrementado(IdProducto entityId, Stock stock) {
        super("sofka.bodega.StockProductoDecrementado");
    }
}
