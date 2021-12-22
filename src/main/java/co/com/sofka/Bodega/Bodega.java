package co.com.sofka.Bodega;

import co.com.sofka.Bodega.entities.Bodeguero;
import co.com.sofka.Bodega.entities.Producto;
import co.com.sofka.Bodega.events.*;
import co.com.sofka.Bodega.values.*;


import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Bodega extends AggregateEvent<IdBodega> {

    protected PapeleriaId papeleriaId;
    protected Set<Producto> productos;
    protected Bodeguero bodeguero;


    public Bodega(IdBodega entityId){
        super(entityId);
    }

    public void AgregarProducto(IdProducto entityId, Nombre nombre, Precio precio, Stock stock , CodigoBarras codigoBarras , Seccion seccion , IdBodega idBodega){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(stock);
        Objects.requireNonNull(codigoBarras);
        Objects.requireNonNull(seccion);
        Objects.requireNonNull(idBodega);
        appendChange(new ProductoCreado(entityId,nombre,precio,stock,codigoBarras,seccion,idBodega)).apply();
    }
    public void ActualizarPrecioProducto(IdProducto entityId , Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioProductoActualizado(entityId,precio));

    }

    public void EliminarProducto(IdProducto entityId ){
        Objects.requireNonNull(entityId);

        appendChange(new ProductoEliminado(entityId));

    }

    public  void  CambiarSeccionProducto(IdProducto entityId , Seccion seccion){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(seccion);
        appendChange(new SeccionProductoCambiada(entityId,seccion));

    }

    public  void  ActualizarNombreProducto(IdProducto entityId , Nombre nombre){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreProductoActualizado(entityId,nombre));

    }


    public  void  QuitarStrockProducto(IdProducto entityId ,Stock stock){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(stock);
        appendChange(new StockProductoDecrementado(entityId,stock));
    }

    public  void  AñadirStrockProducto(IdProducto entityId ,Stock stock){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(stock);
        appendChange(new StockProductoAumentado(entityId,stock));
    }









}
