package co.com.sofka.Factura;

import co.com.sofka.Bodega.values.IdBodega;
import co.com.sofka.Bodega.values.Precio;
import co.com.sofka.Factura.Entities.Cliente;
import co.com.sofka.Factura.Entities.Vendedor;
import co.com.sofka.Factura.events.FacturaCreada;
import co.com.sofka.Factura.events.ServicioAgregado;
import co.com.sofka.Factura.values.Fecha;
import co.com.sofka.Factura.values.IdFactura;
import co.com.sofka.Factura.Entities.Servicio;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Factura extends AggregateEvent<IdFactura> {

    private final Vendedor vendedor;
    private final Cliente cliente;
    private final Fecha fecha;
    private final PapeleriaId papeleriaId;
    private final IdBodega idBodega;
    protected Precio precioFinal;
    protected Set<Servicio> servicios;

    public Factura(IdFactura entityId , Vendedor vendedor , Cliente cliente , Fecha fecha , PapeleriaId papeleriaId , IdBodega idBodega) {
        super(entityId);
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.fecha = fecha;
        this.papeleriaId = papeleriaId;
        this.idBodega = idBodega;
        appendChange(new FacturaCreada(vendedor,cliente,fecha,papeleriaId,idBodega)).apply();
    }

    public void AgregarServicio(String servicio , Long valor){
        Objects.requireNonNull(servicio);
        Objects.requireNonNull(valor);
        appendChange(new ServicioAgregado(servicio,valor)).apply();

    }
    public void AgregarServicio(String servicio , Long valor){
        Objects.requireNonNull(servicio);
        Objects.requireNonNull(valor);
        appendChange(new ServicioAgregado(servicio,valor)).apply();

    }


}
