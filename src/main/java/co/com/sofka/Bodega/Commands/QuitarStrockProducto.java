package co.com.sofka.Bodega.Commands;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.domain.generic.Command;

public class QuitarStrockProducto extends Command {

    private final IdProducto entityId;
    private final Long stock;

    public QuitarStrockProducto(IdProducto entityId, Long stock) {
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
