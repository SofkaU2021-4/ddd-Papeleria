package co.com.sofka.Bodega.events;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.domain.generic.DomainEvent;

public class StockProductoDecrementado extends DomainEvent {
    private final IdProducto entityId;
    private final Long stock;

    public StockProductoDecrementado(IdProducto entityId, Long stock) {
        super("sofka.bodega.StockProductoDecrementado");
        this.entityId = entityId;
        this.stock = stock;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Long getStock() {
        return stock;
    }
}
