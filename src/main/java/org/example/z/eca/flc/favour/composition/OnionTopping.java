package org.example.z.eca.flc.favour.composition;

public class OnionTopping extends Pizza{
    Pizza originalPizza;

    public OnionTopping(Pizza originalPizza){
        this.originalPizza = originalPizza;
    }

    @Override
    public String prepare(){
        return originalPizza.prepare()+addOnions();
    }

    public String addOnions(){
        return " with added Onions";
    }
}
