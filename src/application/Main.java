package application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y= new Triangle();


        System.out.println("Enter the measures of triangle X: ");
        x.a=sc.nextDouble();
        x.b=sc.nextDouble();
        x.c=sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();

//A área de um triângulo pode ser calculada a partir da fórmula:
//A = √(p ⋅ (p - a) ⋅ (p - b) ⋅ (p - c))
//p = (a + b + c)/2

        double areaX = x.area();
        double areaY = y.area();

        if(areaX>areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
        System.out.printf("X area: %.2f\n", areaX );
        System.out.printf("Y area: %.2f\n", areaY);
    }
}