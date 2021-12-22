package co.com.sofka.Factura.Commands;

import co.com.sofka.Factura.values.IdServicio;
import co.com.sofka.Factura.values.Valor;
import co.com.sofka.domain.generic.Command;

public class ActulizarValorUnServicio extends Command {
    private final IdServicio idServicio;
    private final Valor valor;

    public ActulizarValorUnServicio(IdServicio idServicio, Valor valor) {
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
