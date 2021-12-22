package co.com.sofka.Factura.values;

import co.com.sofka.Papeleria.value.AdministradorId;
import co.com.sofka.domain.generic.Identity;

public class IdCliente extends Identity {
    public IdCliente(){

    }

    private IdCliente(String id){
        super(id);
    }

    public static IdCliente of(String id){
        return new IdCliente(id);
    }
}
