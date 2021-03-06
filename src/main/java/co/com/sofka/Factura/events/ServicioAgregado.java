package co.com.sofka.Factura.events;


import co.com.sofka.Factura.values.Descripcion;
import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.Factura.values.Valor;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioAgregado extends DomainEvent {
    private final Descripcion descripcion;
    private final Valor valor;
    private final IdServicio idEntity;

    public ServicioAgregado(IdServicio IdEntity, Descripcion descripcion, Valor valor) {
        super("sofka.factura.ServicioAgregado");
        this.idEntity = IdEntity;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Valor getValor() {
        return valor;
    }

    public IdServicio getIdEntity() {
        return idEntity;
    }
}
