package co.com.sofka.Factura.Commands;

import co.com.sofka.Factura.values.Descripcion;
import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.Factura.values.Valor;
import co.com.sofka.domain.generic.Command;

public class AgregarServicio  extends Command  {

    private final Descripcion descripcion;
    private final Valor valor;
    private final IdServicio idEntity;

    public AgregarServicio(IdServicio IdEntity, Descripcion descripcion, Valor valor) {
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
