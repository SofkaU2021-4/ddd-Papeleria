package co.com.sofka.Bodega.Commands;

import co.com.sofka.Bodega.values.IdProducto;
import co.com.sofka.Bodega.values.Seccion;
import co.com.sofka.domain.generic.Command;

public class CambiarSeccionProducto extends Command {

    private final IdProducto entityId;
    private final Seccion seccion;

    public CambiarSeccionProducto(IdProducto entityId, Seccion seccion) {
        this.entityId = entityId;
        this.seccion = seccion;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Seccion getSeccion() {
        return seccion;
    }
}
