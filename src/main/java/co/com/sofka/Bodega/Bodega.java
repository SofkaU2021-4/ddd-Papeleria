package co.com.sofka.Bodega;

import co.com.sofka.Bodega.entities.Bodeguero;
import co.com.sofka.Bodega.entities.Producto;
import co.com.sofka.Bodega.events.*;
import co.com.sofka.Bodega.values.*;


import co.com.sofka.GenericVO.Direccion;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Bodega extends AggregateEvent<IdBodega> {

    protected PapeleriaId papeleriaId;
    protected Set<Producto> productos;
    protected Bodeguero bodeguero;


    public Bodega(IdBodega entityId,PapeleriaId papeleriaId){
        super(entityId);
        this.papeleriaId=papeleriaId;
    }

    private Bodega(IdBodega entityId){
        super(entityId);
        subscribe(new BodegaChange(this));
    }

    public void AgregarProducto(IdProducto entityId, Nombre nombre, Precio precio, Long stock , CodigoBarras codigoBarras , Seccion seccion , IdBodega idBodega){
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


    public  void  QuitarStrockProducto(IdProducto entityId ,Long stock){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(stock);
        appendChange(new StockProductoDecrementado(entityId,stock));
    }

    public  void  AñadirStrockProducto(IdProducto entityId ,Long stock){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(stock);
        appendChange(new StockProductoAumentado(entityId,stock));
    }

    public Optional<Producto> BuscarProductoPorId(IdProducto entityId ){
        return productos.stream()
                .filter(factura-> factura.equals(entityId))
                .findFirst();
    }

    public  void  ActualizarEmailBodeguero(Email email){
        Objects.requireNonNull(email);
        appendChange(new EmailBodegueroCambiado(email));
    }
    public  void  ActualizarDireccionBodeguero(Direccion direccion){
        Objects.requireNonNull(direccion);
        appendChange(new DireccionBodegueroCambiada(direccion));
    }







}
