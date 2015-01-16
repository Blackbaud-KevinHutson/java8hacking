//to be a functional interface, it must be only 1 method (but default and static is also allowed)
@FunctionalInterface
public interface FunctionMe {
    //i am the functional interface
    public void someMethod();

    //not required to implement this interface method but can use it (and will get it) by default. can be overridden
    //default is powerful. maybe be careful using it. may "may cause ambiguity and compilation errors in complex hierarchies"
    default void anotherMethod(){
    }


    //interfaces now allow static methods
    static String doSomething() {
        return "a string";
    }

    //see also java.util.Collection interface -> stream(), paralellStream(), forEach(), removeIf()


}
