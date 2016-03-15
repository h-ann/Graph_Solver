import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by anna on 3/14/16.
 */
public class GraphSolver<T> {
    int n;
    int k;
    protected Mark[][] graph;

     GraphSolver(int k, int n){
        this.n=n;
        this.k=k;
        graph = new Mark[k][];
        for(int i = 0; i<k; i++){
            graph[i] = new Mark[n];
        }

    }

    public void graphInit(T[][] markValues,T[][][] arc){

        for(int i=0; i<k; i++ ) {
            for (int j = 0; j < n; j++) {

                graph[i][j]= new Mark(markValues[i][j].getClass(),markValues[i][j],k,arc[i][j]);

            }
        }
        printGraph();
    }

    public void printGraph(){
        for(int i=0; i< k;i++){
            for (int j=0; j<n;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

}
