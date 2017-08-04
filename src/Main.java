import java.util.Arrays;

/**
 * Created by grv on 04/08/17.
 */
public class Main {
    static final int SIZE=10;

    public static void main(String args[]){
        int[] a,b;
        int[] c= new int[SIZE];
        a=new int[SIZE];
        b=new int[SIZE];

        Arrays.fill(a, 2);
        Arrays.fill(b, 3);


        for(int i=0;i<SIZE;i++)
            c[i]=a[i]+b[i];

        SingleLoop.perform();
        SelfLoop.initialize();
    }
}
