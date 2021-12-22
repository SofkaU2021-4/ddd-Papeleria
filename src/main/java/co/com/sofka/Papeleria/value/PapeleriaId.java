package co.com.sofka.Papeleria.value;


import co.com.sofka.domain.generic.Identity;

public class PapeleriaId extends Identity {


    public PapeleriaId(){

    }

    private PapeleriaId(String id){
        super(id);
    }

    public static PapeleriaId of(String id){
        return new PapeleriaId(id);
    }
}
