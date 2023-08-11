package Java_projects.Pizza_baking;

import java.util.Scanner;

import jdk.jshell.Snippet;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scan.nextLine();


        personal_ID person = new personal_ID(name,"GHCEP");


        System.out.println("Hello " + person.name + ",Welcome to Eddy's Pizza");
        System.out.println("Today , I am making custom pizza for you");
        System.out.println("Let's have some fun as we make your favorite pizza together... ");


          System.out.println("Which kind of bread would you like for your pizza? ");
          Scanner breads = new Scanner(System.in);
          String bread = breads.nextLine();
          System.out.println("Great!" + breads + " is tasty");


          System.out.println("Which flavor of sauce would you like for your pizza? ");
          Scanner sauces = new Scanner(System.in);
          String sauce = sauces.nextLine();
          System.out.println("Great!" + sauce + " it is");


          System.out.println("Which kind of cheese would you like for your pizza? ");
          Scanner cheeses = new Scanner(System.in);
          String cheese = cheeses.nextLine();
          System.out.println("Great!" + cheese + "is tasty");


          System.out.println("Which kind of topping would you like for your pizza? ");
          Scanner toppings = new Scanner(System.in);
          String topping = toppings.nextLine();
          System.out.println("Great!" + topping + " is tasty");

          pizza Pizza = new pizza(bread,cheese,sauce,topping);

          System.out.println("Alright, that will be $19.99");




       // Create a pizza baking systemm , where i ask for customers name and create them a personal ID
        // I then ask them questions and make thme give input and use that inoput to create a pizza
        // i want to use classes, for , strings and others for this task


    }

    // Preferences to create the pizza
//    static void preferences(String[] choices_made){
//        String[] choices  = {"Bread","sauce","cheese","pepperoni"};
////        String[] choices_made = new String[4]
//
//
//        int i = 0;
//        System.out.println("If you want something,press Y , if not press N");
//        while (i < choices.length){
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Do you want " + choices[i]);
//            String question = scanner.nextLine();
//
//            if (question.equalsIgnoreCase("Y")){
//                choices_made[i] = choices[i];
//            }
//
//            i++;
//        }
//    }


}
