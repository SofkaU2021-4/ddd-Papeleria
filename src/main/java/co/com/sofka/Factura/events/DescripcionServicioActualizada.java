package co.com.sofka.Factura.events;

import co.com.sofka.Factura.values.Descripcion;
import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionServicioActualizada extends DomainEvent {
    private final IdServicio idServicio;
    private final Descripcion descripcion;

    public DescripcionServicioActualizada(IdServicio idServicio, Descripcion descripcion) {
        super("sofka.factura.DescripcionServicioActualizada");
        this.idServicio = idServicio;
        this.descripcion = descripcion;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
