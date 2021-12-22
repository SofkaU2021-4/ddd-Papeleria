package co.com.sofka.Factura.Entities;

import co.com.sofka.Factura.values.IdVendedor;
import co.com.sofka.domain.generic.Entity;

public class Vendedor extends Entity<IdVendedor> {
    public Vendedor(IdVendedor entityId) {
        super(entityId);
    }
}
