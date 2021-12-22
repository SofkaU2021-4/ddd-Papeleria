package co.com.sofka.Factura.events;

import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.Factura.values.Valor;
import co.com.sofka.domain.generic.DomainEvent;

public class ValorServicioActualizada extends DomainEvent {
    private final IdServicio idServicio;
    private final Valor valor;

    public ValorServicioActualizada(IdServicio idServicio, Valor valor) {
        super("sofka.factura.ValorServicioActualizada");
        this.idServicio = idServicio;
        this.valor = valor;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Valor getValor() {
        return valor;
    }
}
