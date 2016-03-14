import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by anna on 3/14/16.
 */
public class GraphSolver<T> {
    int n;
    int k;
    protected Mark<T>[][] graph;

    public GraphSolver( Class<T> tclass, int k, int n){

        this.n=n;
        this.k=k;
        graph = (Mark<T>[][]) Array.newInstance(tclass,k,n);
        for(int i = 0; i<k; i++){
            graph[i]= (Mark<T>[]) Array.newInstance(tclass,n);
        }

    }

    public void graphInit(){

        for(int i=0; i<k; i++ ) {
            for (int j = 0; j < n; j++) {
                graph[i][j]= new Mark<T>();
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
