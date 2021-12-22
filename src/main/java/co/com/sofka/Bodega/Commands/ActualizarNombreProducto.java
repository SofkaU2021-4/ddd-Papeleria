package co.com.sofka.Bodega.Commands;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreProducto extends Command {

    private final IdProducto entityId;
    private final Nombre nombre;

    public ActualizarNombreProducto(IdProducto entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
