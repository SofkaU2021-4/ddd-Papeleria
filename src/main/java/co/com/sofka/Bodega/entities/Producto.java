package co.com.sofka.Bodega.entities;

import co.com.sofka.Bodega.values.*;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<IdProducto> {

    public Nombre nombre ;
    public Precio precio;
    public Long stock;
    public CodigoBarras  codigoBarras;
    public Seccion seccion;
    private final IdBodega idBodega;
    public IdBodega bodegaId;

    public Producto(IdProducto entityId, Nombre nombre, Precio precio, Long stock , CodigoBarras codigoBarras , Seccion seccion , IdBodega idBodega) {
        super(entityId);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigoBarras = codigoBarras;
        this.seccion = seccion;
        this.idBodega = idBodega;
    }

    public void ActualizarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);

    }
    public void ActualizarSeccion(Seccion seccion){
        this.seccion = Objects.requireNonNull(seccion);

    }
    public void ActualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);

    }


    public void DecrementarStock(Long stock){
         Objects.requireNonNull(stock);
         this.stock= this.stock-stock;


    }
    public void AumentarStock(Long stock){
        Objects.requireNonNull(stock);
        this.stock= this.stock+stock;

    }



    public Nombre nombre() {
        return nombre;
    }

    public Precio precio() {
        return precio;
    }

    public Long stock() {
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
