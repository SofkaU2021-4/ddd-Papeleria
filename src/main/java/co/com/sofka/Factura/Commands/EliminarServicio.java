package co.com.sofka.Factura.Commands;

import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.domain.generic.Command;

public class EliminarServicio extends Command {

    private final IdServicio idServicio;

    public EliminarServicio(IdServicio idServicio) {
        this.idServicio = idServicio;
    }

    public IdServicio getIdServicio() {
        return idServicio;
    }
}
