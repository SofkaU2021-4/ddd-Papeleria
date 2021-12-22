package co.com.sofka.Factura.Entities;


import co.com.sofka.Factura.values.IdCliente;
import co.com.sofka.domain.generic.Entity;

public class Cliente  extends Entity<IdCliente> {
    public Cliente(IdCliente entityId) {
        super(entityId);
    }
}
