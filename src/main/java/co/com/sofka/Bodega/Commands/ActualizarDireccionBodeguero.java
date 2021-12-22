package co.com.sofka.Bodega.Commands;

import co.com.sofka.GenericVO.Direccion;

public class ActualizarDireccionBodeguero {
    private final Direccion direccion;

    public ActualizarDireccionBodeguero(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
