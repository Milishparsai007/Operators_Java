import java.lang.*;
public class IncDec {
    public static void main(String[] args) {
        int x=5;
        //int y=x++;
        //int z=++x;
        //System.out.println(y);
        //System.out.println(z);
        int a=2*x++ + 3* ++x;
        System.out.println(a);
        float b=3.5f;
        System.out.println(++b);
        char c='A';
        System.out.println(++c);
        byte d=10;
        System.out.println(++d);

        //Note:- all data types can use increment or decrement operators except boolean.

        boolean e= true;
        //System.out.println(e++);
    }
}
