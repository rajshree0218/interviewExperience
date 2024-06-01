package org.example.interview.designpatterns.creational;

//implementation of Factory Design Pattern
// JDBC uses factories extensively for creating connections, statements and result sets.
// Dependency Injection Framework like spring and guice rely heavily on factories to create and manage beans.
// Log4j uses factories to create loggers with different configurations, enabling control over logging levels and o/p destinations.

public class FactoryThroughInterfaceDemo {

    public static void main(String[] args){
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.factoryMethod();
        productA.display();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.factoryMethod();
        productB.display();
    }
}

interface Product{
    void display();
}

class ConcreteProductA implements Product{
    @Override
    public void display(){
        System.out.println("logic to display through product A");
    }
}

class ConcreteProductB implements Product{
    @Override
    public void display(){
        System.out.println("logic to display through product B");
    }
}

interface Factory{
    Product factoryMethod();
}

class ConcreteFactoryA implements Factory{
    @Override
    public Product factoryMethod(){
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements Factory{
    @Override
    public Product factoryMethod(){
        return new ConcreteProductB();
    }
}
