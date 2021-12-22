package co.com.sofka.Factura;

import co.com.sofka.Bodega.entities.Producto;
import co.com.sofka.Bodega.events.ProductoCreado;
import co.com.sofka.Bodega.values.IdBodega;
import co.com.sofka.Factura.Entities.Servicio;
import co.com.sofka.Factura.events.*;
import co.com.sofka.Factura.values.*;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class FacturaChange extends EventChange {
    public FacturaChange(Factura factura) {

        apply((DescripcionServicioActualizada event) ->{
           var servicio =  factura.getServicioPorId(event.getIdServicio())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el servicio"));
            servicio.ActualizarDescripcion(event.getDescripcion());
        });

        apply((ValorServicioActualizada event) ->{
            var servicio =  factura.getServicioPorId(event.getIdServicio())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el servicio"));
            servicio.ActualizarValor(event.getValor());
        });
        apply((FacturaCreada event)->{
            factura.vendedorId = event.getIdVendedor();
            factura.clienteID = event.getIdCliente();
            factura.fecha = event.getFecha();
            factura.papeleriaId = event.getPapeleriaId();
            factura.idBodega = event.getIdBodega();
            factura.servicios = new HashSet<>();
        });
        apply((ServicioAgregado event)->{
            factura.servicios.add(new Servicio(event.getIdEntity(),event.getDescripcion(),event.getValor()));
        });

        apply((ServicioEliminado event) -> {
            factura.servicios.removeIf(servicio -> servicio.identity().equals(event.getIdServicio()));
        });



    }
}
