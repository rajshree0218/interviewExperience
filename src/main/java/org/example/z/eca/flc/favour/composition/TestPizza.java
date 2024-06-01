package org.example.z.eca.flc.favour.composition;

//Design composition over inheritance
public class TestPizza {
    public static void main(String[] args) {
        // Customer A
        Pizza pizza = new CheeseBrustPizza();
        String pizzaReady = pizza.prepare();
        System.out.println(pizzaReady);

        // Customer B
        Pizza pizzaB =new TomatoTopping(new ThinCrustPizza());
        String pizzaReadyB = pizzaB.prepare();
        System.out.println(pizzaReadyB);

        // Customer C
        Pizza pizzaC =new CapsicumTopping(new CheeseBrustPizza());
        String pizzaReadyC = pizzaC.prepare();
        System.out.println(pizzaReadyC);

        // Customer D
        Pizza pizzaD =new OnionTopping(new CheeseBrustPizza());
        String pizzaReadyD = pizzaD.prepare();
        System.out.println(pizzaReadyD);

        // Customer E
        Pizza pizzaE =new OnionTopping(new TomatoTopping(new CheeseBrustPizza()));
        String pizzaReadyE = pizzaE.prepare();
        System.out.println(pizzaReadyE);
    }
}
