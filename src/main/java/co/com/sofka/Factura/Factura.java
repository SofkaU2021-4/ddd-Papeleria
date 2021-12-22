package co.com.sofka.Factura;

import co.com.sofka.Bodega.values.IdBodega;
import co.com.sofka.Factura.events.*;
import co.com.sofka.Factura.values.*;
import co.com.sofka.Factura.Entities.Servicio;

import co.com.sofka.Papeleria.Papeleria;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Factura extends AggregateEvent<IdFactura> {

    protected  IdVendedor vendedorId;
    protected  IdCliente clienteID;
    protected  Fecha fecha;
    protected  PapeleriaId papeleriaId;
    protected  IdBodega idBodega;
    protected  Set<Servicio> servicios;

    public Factura(IdFactura entityId , IdVendedor vendedorId , IdCliente clienteID , Fecha fecha , PapeleriaId papeleriaId , IdBodega idBodega) {
        super(entityId);
        this.vendedorId = vendedorId;
        this.clienteID = clienteID;
        this.fecha = fecha;
        this.papeleriaId = papeleriaId;
        this.idBodega = idBodega;
        appendChange(new FacturaCreada(vendedorId,clienteID,fecha,papeleriaId,idBodega)).apply();
    }
    private Factura(IdFactura entityId){
        super(entityId);
        subscribe(new FacturaChange(this));
    }



    public static Factura from(IdFactura idFactura, List<DomainEvent> events){
        var factura = new Factura(idFactura);
        events.forEach(factura::applyEvent);
        return factura;
    }

    public void AgregarServicio(IdServicio IdEntity, Descripcion descripcion, Valor valor){
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(valor);
        Objects.requireNonNull(IdEntity);
        appendChange(new ServicioAgregado(IdEntity,descripcion,valor)).apply();

    }
    public void EliminarServicio(IdServicio idServicio){
        Objects.requireNonNull(idServicio);
        appendChange(new ServicioEliminado(idServicio)).apply();

    }
    public void ActulizarDescripcionUnServicio(IdServicio idServicio, Descripcion descripcion){
        Objects.requireNonNull(idServicio);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionServicioActualizada(idServicio,descripcion)).apply();
    }

    public void ActulizarValorUnServicio(IdServicio idServicio, Valor valor){
        Objects.requireNonNull(idServicio);
        Objects.requireNonNull(valor);
        appendChange(new ValorServicioActualizada(idServicio,valor)).apply();
    }

    public Optional<Servicio> getServicioPorId(IdServicio entityId ){
        return servicios.stream()
                .filter(servicio-> servicio.equals(entityId))
                .findFirst();
    }



}
