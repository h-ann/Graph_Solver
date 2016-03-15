import java.util.Random;

/**
 * Created by anna on 3/15/16.
 */
public class GrRandIntSet {

    static Integer[][]  setMarkValuesRandom(int k, int n){
        Integer[][] markValues = new Integer[k][n];
        Random r = new Random();
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                markValues[i][j] = r.nextInt(10);
            }
        }
        return markValues;
    }
    static Integer [][][]  setArcRandom( int k,  int n){
        Integer [][][] arc = new Integer[k][n][k];
        Random r = new Random();
        for(int i=0; i<k; i++){ // every column
            for(int j=0; j<n; j++){ // every mark
                for(int l=0; l<k; l++){ //list of input arc for each mark
                    arc[i][j][l] = (Integer)r.nextInt(10);
                }
            }
        }
        return arc;
    }

}
