package co.com.sofka.Bodega.entities;

import co.com.sofka.Bodega.values.*;
import co.com.sofka.domain.generic.Entity;

public class Producto extends Entity<IdProducto> {

    public Nombre nombre ;
    public Precio precio;
    public Stock stock;
    public CodigoBarras  codigoBarras;
    public Seccion seccion;
    private final IdBodega idBodega;
    public IdBodega bodegaId;

    public Producto(IdProducto entityId, Nombre nombre, Precio precio, Stock stock , CodigoBarras codigoBarras , Seccion seccion , IdBodega idBodega) {
        super(entityId);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigoBarras = codigoBarras;
        this.seccion = seccion;
        this.idBodega = idBodega;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Precio precio() {
        return precio;
    }

    public Stock stock() {
        return stock;
    }

    public CodigoBarras codigoBarras() {
        return codigoBarras;
    }

    public Seccion seccion() {
        return seccion;
    }

    public IdBodega idBodega() {
        return idBodega;
    }

    public IdBodega bodegaId() {
        return bodegaId;
    }
}
