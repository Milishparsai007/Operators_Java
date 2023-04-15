import java.lang.*;
public class Bitwise {
    public static void main(String[] args) {
        //int x=10;
        //int y=6;
        int z;
        //int x=0b1010;  10
        //int y=0b0110;  06
        //z=x&y;
        //Integer.toBinaryString prints the given integer in binary form.
        //System.out.println(Integer.toBinaryString(z));
        //z=x|y;
        //z=x^y;
        //int x=1;
        //int x=0b1000; //16
        //z=x<<2;       //left shift by 2 places. Note:- Left shifting will increase the number by 2^k.

        //int x=10;
        //z=x>>1;         //right shift the number by 1.Note:- right shifting the number will decrease the number i.e.,divide it by 2^k.

        //int x=-0b1010;
        //z=x>>>1;         //unsigned right shift

        int x=0b1010;
        z=~x;
        System.out.println(z);
    }
}
