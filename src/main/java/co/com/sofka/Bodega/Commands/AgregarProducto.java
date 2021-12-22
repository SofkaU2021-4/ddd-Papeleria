package co.com.sofka.Bodega.Commands;

import co.com.sofka.Bodega.values.*;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarProducto extends Command {

    private final IdProducto entityId;
    private final Nombre nombre;
    private final Precio precio;
    private final Long stock;
    private final CodigoBarras codigoBarras;
    private final Seccion seccion;
    private final IdBodega idBodega;

    public AgregarProducto(IdProducto entityId, Nombre nombre, Precio precio, Long stock, CodigoBarras codigoBarras, Seccion seccion, IdBodega idBodega) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigoBarras = codigoBarras;
        this.seccion = seccion;
        this.idBodega = idBodega;
    }

    public IdProducto getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Long getStock() {
        return stock;
    }

    public CodigoBarras getCodigoBarras() {
        return codigoBarras;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public IdBodega getIdBodega() {
        return idBodega;
    }
}
