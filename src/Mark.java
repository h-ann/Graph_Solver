import java.lang.reflect.Array;

/**
 * Created by anna on 3/14/16.
 */
public class Mark<M> {
    private M markValue;
    private M maxSum;
    private M[] g;
    private M gMax;

    Mark(Class<M> tclass, M markValue,  int k, M[] ginit){
        this.markValue= markValue;
        g = (M[]) Array.newInstance(tclass,k);
        this.setG(k,ginit);
    }

    public M[] getG(){return g;}
    public M getSum() {return maxSum;}
    public M getgMax() {return gMax;}
    public M getMarkValue() {return markValue;}

    private void setG(int k, M[] ginit) {
        for(int i = 0; i<k;i++){
            g[i]=  ginit[i];
        }
    }

    @Override
    public String toString(){
        return ""+markValue;
    }
}
