import java.util.Scanner;
import java.text.DecimalFormat;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        
        double a, b, c, s, areaOfTriangle;

        System.out.println("Enter length of side a: ");
        a = keyboard.nextDouble();
        System.out.println("Enter length of side b: ");
        b = keyboard.nextDouble();
        System.out.println("Enter length of side c: ");
        c = keyboard.nextDouble();

        s = (a + b + c) / 2;

        areaOfTriangle = Math.sqrt(s * (s-a) * (s-b) * (s-c) );

        DecimalFormat fmt = new DecimalFormat("0.###");

        System.out.println(fmt.format(areaOfTriangle));

// Write an application that prompts and reads the lengths of the sides of a triangle from the user 
// (use the Scanner class). Compute the area of the triangle using Heron’s formula (below), where s 
// represents half of the perimeter of the triangle, and a, b, and c represent the lengths of the 
// three sides  (use the appropriate Math methods). Note: DO NOT ask the user for the value of 
// “s”; calculate it yourself. Print the area to three decimal places using the DecimalFormat 
// class. 

    }
}
