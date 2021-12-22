package co.com.sofka.Bodega;


import co.com.sofka.Bodega.entities.Producto;
import co.com.sofka.Bodega.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class BodegaChange extends EventChange {
    public BodegaChange(Bodega bodega) {


        apply((BodegaCreada event)->{
            bodega.papeleriaId= event.getPapeleriaId();
            bodega.productos = new HashSet<>();
        });

        apply((ProductoCreado event)->{
             bodega.productos.add(new Producto(
                     event.getEntityId(),
                     event.getNombre(),
                     event.getPrecio(),event.getStock(),
                     event.getCodigoBarras(),
                     event.getSeccion(),
                     event.getIdBodega()));
        });

        apply((NombreProductoActualizado event)->{
          var producto=  bodega.BuscarProductoPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el Producto"));
            producto.ActualizarNombre(event.getNombre());
        });


        apply((ProductoEliminado event)->{
            bodega.productos.removeIf(producto -> producto.identity().equals(event.getEntityId()));
        });

        apply((SeccionProductoCambiada event)->{
            var producto=  bodega.BuscarProductoPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el Producto"));
            producto.ActualizarSeccion(event.getSeccion());
        });
        apply((StockProductoAumentado event)->{
            var producto=  bodega.BuscarProductoPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el Producto"));
            producto.AumentarStock(event.getStock());
        });

        apply((StockProductoDecrementado event)->{
            var producto=  bodega.BuscarProductoPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el Producto"));
            producto.DecrementarStock(event.getStock());
        });

        apply((PrecioProductoActualizado event)->{
            var producto=  bodega.BuscarProductoPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el Producto"));
            producto.ActualizarPrecio(event.getPrecio());
        });

        apply((DireccionBodegueroCambiada event)->{
            bodega.bodeguero.ActualizarDireccion(event.getDireccion());
        });
        apply((EmailBodegueroCambiado event)->{
            bodega.bodeguero.ActualizarEmail(event.getEmail());
        });




    }
}
