package org.example.z.eca.flc.favour.composition;

public class CapsicumTopping extends Pizza{
    Pizza originalPizza;

    public CapsicumTopping(Pizza originalPizza){
        this.originalPizza = originalPizza;
    }

    @Override
    public String prepare(){
        return originalPizza.prepare()+addCapsicums();
    }

    public String addCapsicums(){
        return " with added Capsicums";
    }
}
