/**
 * Created by grv on 04/08/17.
 */
public class SelfLoop {
    static final int SIZE=10;

    public static void initialize(){
        int[] z=new int[SIZE];
        z[0]=1;
        for (int i=1;i<SIZE;i++){
            z[i]=z[i-1]+1;
        }
    }
}
