import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        //Area of triangle = 1/2b*h
        /*Scanner sc = new Scanner(System.in);
        System.out.print("ENter height of triangle : ");
        float h=sc.nextFloat();
        System.out.print("Enter base of triangle : ");
        float b=sc.nextFloat();
        float area = (float) (b*h)/2;
        System.out.println(area);

         */
        //Area of triangle by sides
        //S = 1/2(a+b+c)
        //A = root(s*(s-a)*(s-b)*(s-c))
        float s,a,b,c;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle : ");
        System.out.print("a: ");
        a=sc.nextFloat();
        System.out.print("b: ");
        b=sc.nextFloat();
        System.out.print("c: ");
        c=sc.nextFloat();

        s=(float)1/2*(a+b+c);
        System.out.println(s);
        area = s*(s-a)*(s-b)*(s-c);
        System.out.println("Area of triangle is : "+Math.sqrt(area));
    }
}
