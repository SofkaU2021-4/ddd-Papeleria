package co.com.sofka.Factura.Commands;

import co.com.sofka.Bodega.values.IdBodega;
import co.com.sofka.Factura.values.Fecha;
import co.com.sofka.Factura.values.IdCliente;
import co.com.sofka.Factura.values.IdVendedor;
import co.com.sofka.Papeleria.value.PapeleriaId;
import co.com.sofka.domain.generic.Command;

public class CrearFactura extends Command {
    private final Fecha fecha;
    private final PapeleriaId papeleriaId;
    private final IdBodega idBodega;
    private final IdVendedor idVendedor;
    private final IdCliente idCliente;


    public CrearFactura(IdVendedor idVendedor, IdCliente idCliente, Fecha fecha, PapeleriaId papeleriaId, IdBodega idBodega) {
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.papeleriaId = papeleriaId;
        this.idBodega = idBodega;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public PapeleriaId getPapeleriaId() {
        return papeleriaId;
    }

    public IdBodega getIdBodega() {
        return idBodega;
    }

    public IdVendedor getIdVendedor() {
        return idVendedor;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }
}
