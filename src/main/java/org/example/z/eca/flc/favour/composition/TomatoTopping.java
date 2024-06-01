package org.example.z.eca.flc.favour.composition;

public class TomatoTopping extends Pizza{
    Pizza originalPizza;

    public TomatoTopping(Pizza originalPizza){
        this.originalPizza = originalPizza;
    }

    @Override
    public String prepare(){
        return originalPizza.prepare()+addTomatoes();
    }

    public String addTomatoes(){
        return " with added Tomatoes";
    }
}
