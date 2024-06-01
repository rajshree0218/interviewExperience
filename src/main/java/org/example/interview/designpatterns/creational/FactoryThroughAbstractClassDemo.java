package org.example.interview.designpatterns.creational;

//implementation of FactoryProgram Design Pattern
// JDBC uses factories extensively for creating connections, statements and result sets.
// Dependency Injection Framework like spring and guice rely heavily on factories to create and manage beans.
// Log4j uses factories to create loggers with different configurations, enabling control over logging levels and o/p destinations.
// Pros: Encapsulation, Extensibility, Testability, Decoupling, Code Re-usability
public class FactoryThroughAbstractClassDemo {

    public static void main(String[] args){
        FactoryProgram FactoryProgramA = new ConcreteFactoryProgramA();
        Program ProgramA = FactoryProgramA.factoryProgramMethod();
        ProgramA.display();

        FactoryProgram FactoryProgramB = new ConcreteFactoryProgramB();
        Program ProgramB = FactoryProgramB.factoryProgramMethod();
        ProgramB.display();
    }
}

abstract class Program{
    public abstract void display();
}

class ConcreteProgramA extends Program{
    @Override
    public void display(){
        System.out.println("logic to display through Program A");
    }
}

class ConcreteProgramB extends Program{
    @Override
    public void display(){
        System.out.println("logic to display through Program B");
    }
}

abstract class FactoryProgram{
    public abstract Program factoryProgramMethod();
}

class ConcreteFactoryProgramA extends FactoryProgram{
    @Override
    public Program factoryProgramMethod(){
        return new ConcreteProgramA();
    }
}

class ConcreteFactoryProgramB extends FactoryProgram{
    @Override
    public Program factoryProgramMethod(){
        return new ConcreteProgramB();
    }
}
