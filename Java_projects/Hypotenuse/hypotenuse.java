package Java_projects.Hypotenuse;

import static java.lang.Math.sqrt;

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        System.out.println("This program finds the hypotenuse of a triangle");
        System.out.println("Enter the value of the opposite side of the triangle: ");
        Scanner oppositeSide = new Scanner(System.in);
        double oppositeValue = oppositeSide.nextDouble();

        System.out.println("Enter the value of the adjacent side of the triangle: ");
        Scanner adjacentSide = new Scanner(System.in);
        double adjacentValue = adjacentSide.nextDouble();

        System.out.println("The value of the hypotenuse is: ");
        double result = Math.sqrt((adjacentValue * adjacentValue) + (oppositeValue * oppositeValue));

        System.out.println(result);

        oppositeSide.close();
        adjacentSide.close();


    }
}
