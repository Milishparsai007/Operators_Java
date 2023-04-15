import java.lang.*;
import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimesnions of cuboid : ");
        int l,b,h;
        System.out.print("l : ");
        l=sc.nextInt();
        System.out.print("b: ");
        b=sc.nextInt();
        System.out.print("c: " );
        h=sc.nextInt();
        float area,volume;
        area = l*b+b*h+h*l;
        volume = l*b*h;
        System.out.println("Area : "+area);
        System.out.println("Volume : "+volume);
    }
}
