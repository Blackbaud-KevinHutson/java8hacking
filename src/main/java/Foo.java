import java.util.Arrays;

public class Foo {
    private String bar;

    public static void main(String[] args) {
        new Foo().thing("stuff");
    }

    //http://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html
    public void thing(String other) {
        System.out.println("hiya" + other);

        final String separator = ",";

        //lambdas
        Arrays.asList("a", "b",  "c", "d").forEach(
                (String e) -> System.out.println(e + separator));

    }

    public void thing2(String other) {
        System.out.println("hiya" + other);

        int [] nums = {1, 11, 22, 2, 32, 3, 67, 4, -2};

        Arrays.parallelSort(nums);

        for (int num : nums) {
            System.out.println("num = " + num);

        }
    }
}
