package co.com.sofka.Factura.Commands;

import co.com.sofka.Factura.values.Descripcion;
import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.domain.generic.Command;

public class ActulizarDescripcionUnServicio extends Command {

    private final IdServicio idServicio;
    private final Descripcion descripcion;

    public ActulizarDescripcionUnServicio(IdServicio idServicio, Descripcion descripcion) {
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
