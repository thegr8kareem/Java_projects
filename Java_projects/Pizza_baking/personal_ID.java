package Java_projects.Pizza_baking;

import java.util.Random;
import java.util.Scanner;

public class personal_ID {

        String name;
        String words ;
        Random random = new Random();


    //    Personal ID Generator
        personal_ID(String name,String words){
              this.name = name;
              this.words  = words;

              for (int i = 0; i < 4; i++) {
                 Integer number = random.nextInt(100) + 1;
                 words += number.toString();
              }

              System.out.println("This is your personal ID: " + words);
        }






}
