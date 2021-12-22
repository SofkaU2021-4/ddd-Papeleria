package co.com.sofka.Bodega.values;

import co.com.sofka.domain.generic.Identity;

public class IdBodeguero extends Identity {

    public IdBodeguero(){

    }

    private IdBodeguero(String id){
        super(id);
    }

    public static IdBodeguero of(String id){
        return new IdBodeguero(id);
    }
}
