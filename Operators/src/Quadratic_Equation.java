import java.lang.*;
import java.util.Scanner;
public class Quadratic_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,D;
        float r1,r2;
        System.out.print("Enter the coefficient of x^2 : ");
        a=sc.nextInt();
        System.out.print("Enter the coefficient of x : ");
        b=sc.nextInt();
        System.out.print("Enter the constant term : ");
        c=sc.nextInt();

        D=b*b-4*a*c;
        if(D<0)
        {
            System.out.println("Roots of the quadratic equation "+a+"x^2+"+b+"x+"+c+"=0 are imaginary");
        }
        else
        {
            r1 = (float)(-b+Math.sqrt(D))/(2*a);
            r2 = (float)(-b-Math.sqrt(D))/(2*a);
            System.out.println("Roots are : "+r1+"\n"+r2);
        }
    }
}
