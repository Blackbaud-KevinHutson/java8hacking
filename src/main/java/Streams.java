import java.util.Arrays;
import java.util.Collection;
import java.util.OptionalLong;
import java.util.stream.LongStream;

//http://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html
public class Streams  {
    //FIXME read and understand
    public static void main(String[] args) {
        System.out.println("hi");
        final Collection< Task > tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );

// Calculate total points of all active tasks using sum()
        final long totalPointsOfOpenTasks = tasks
                .stream()
                .filter( task -> task.getStatus() == Status.OPEN )
                .mapToInt( Task::getPoints )
                .sum();

        System.out.println( "Total points: " + totalPointsOfOpenTasks );

        final long biggerThan10 = tasks
                .stream()
                .filter(task -> task.getPoints() > 10)
                .mapToLong(Task::getPoints) // <- method reference Task::getPoints
                .distinct().findAny().getAsLong(); // hmmm
        System.out.println( "biggerThan10: " + biggerThan10 );

        //TODO read LongStream, see also reduce/collect, etc. reminds me of ruby functional methods



    }

    private enum Status {
        OPEN, CLOSED
    };

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task( final Status status, final Integer points ) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }
}