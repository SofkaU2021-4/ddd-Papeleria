package co.com.sofka.Bodega.Commands;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.domain.generic.Command;

public class EliminarProducto extends Command {
    private final IdProducto entityId;

    public EliminarProducto(IdProducto entityId) {
        this.entityId = entityId;
    }

    public IdProducto getEntityId() {
        return entityId;
    }
}
