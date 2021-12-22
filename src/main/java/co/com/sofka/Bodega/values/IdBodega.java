package co.com.sofka.Bodega.values;


import co.com.sofka.domain.generic.Identity;

public class IdBodega extends Identity {
    public IdBodega(){

    }

    private IdBodega(String id){
        super(id);
    }

    public static IdBodega of(String id){
        return new IdBodega(id);
    }
}
