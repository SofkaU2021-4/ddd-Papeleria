package co.com.sofka.Factura.events;

import co.com.sofka.Bodega.values.IdBodega;
import co.com.sofka.Factura.Entities.Cliente;
import co.com.sofka.Factura.Entities.Vendedor;
import co.com.sofka.Factura.values.Fecha;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaCreada extends DomainEvent {
    public FacturaCreada(Vendedor vendedor, Cliente cliente, Fecha fecha, PapeleriaId papeleriaId, IdBodega idBodega) {
        super("sofka.factura.FacturaCreada");
    }
}
