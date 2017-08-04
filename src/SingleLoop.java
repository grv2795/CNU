
/**
 * Created by grv on 04/08/17.
 */
public class SingleLoop {
    static final int SIZE=10;

    public static void perform(){
        int[] t=new int[SIZE];
        for (int i=0;i<SIZE;i++){
            t[i]=(int)Math.pow(2,i);
        }
    }
}
