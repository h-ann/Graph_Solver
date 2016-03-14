import java.util.Random;

/**
 * Created by anna on 3/14/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("I am happy :)");
        Mark<Integer> mark = new Mark<>();
        GraphSolver graphSolver = new GraphSolver(mark.getClass(), 2, 3);
        graphSolver.graphInit();
    }

}
