/**
 * Created by anna on 3/14/16.
 */
public class Main {

    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        GraphSolver<Integer> graphSolver = new GraphSolver<>( k, n);

        Integer[][] markValues = GrRandIntSet.setMarkValuesRandom(k,n);
        Integer [][][] arc = GrRandIntSet.setArcRandom(k,n);

        graphSolver.graphInit(markValues,arc);
    }


}
