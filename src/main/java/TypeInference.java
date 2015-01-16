
//http://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html
public class TypeInference {
    public static void main(String[] args) {
        System.out.println("hi");
        final Value< String > value = new Value<>();
        value.getOrDefault( "22", Value.defaultValue() );

        //java 7 would require this to be written as Value.< String >defaultValue(). in 8, this type is inferred
        String orDefault = value.getOrDefault("22", Value.defaultValue());
        System.out.println("thing " + orDefault);
    }
}