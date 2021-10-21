package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * The entry point of application.
     *Testing the application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //The list of sports played by the user1
        //sports and hours played are input by default.
        List<Sport> sportlist = new ArrayList<>();
        Basketball basketBall1= new Basketball();
        Football footBall = new Football();
        Running run = new Running();
        HighJump highJump = new HighJump();
        Basketball basketBall2 = new Basketball();

        //adding the sports into the first list.
        sportlist.add(basketBall2);
        sportlist.add(basketBall1);
        sportlist.add(highJump);
        sportlist.add(run);
        sportlist.add(footBall);

        //list of sports played by the user2
        List<Sport> sportlist2 = new ArrayList<>();
        Basketball basketball = new Basketball();
        Football football1 = new Football();
        Football football2 = new Football();
        Running running = new Running();
        HighJump highJump2 = new HighJump();

        //adding the sports into the second list.
        sportlist2.add(basketball);
        sportlist2.add(football1);
        sportlist2.add(highJump2);
        sportlist2.add(running);
        sportlist2.add(football2);

        //list of sports played by the user3
        List<Sport> sportlist3 = new ArrayList<>();
        Basketball basketball3 = new Basketball();
        Football football3 = new Football();
        Running running3 = new Running();
        HighJump highJump3 = new HighJump();

        //adding the sports into the third list.
        sportlist3.add(basketball3);
        sportlist3.add(football3);
        sportlist3.add(highJump3);
        sportlist3.add(running3);
        sportlist3.add(running3);

        //creating 3 users for a coplex JUnit.
        User user1 = new User("Popa", "Alex", sportlist);
        User user2 = new User("Greavu", "Andreea", sportlist2);
        User user3 = new User("Radu", "Bianca", sportlist3);

        System.out.println("The total time spent practicing sports is : " + user1.calculateTime());
        System.out.println("The time of the favourite sport played is: "+ user1.calculateTime(basketBall1));
        System.out.println("The average time spent playing sports is: "+ user1.calculateMediumTime()+ "\n");

        System.out.println("The total time spent practicing sports is : " + user2.calculateTime());
        System.out.println("The time of the favourite sport played is: "+ user2.calculateTime(footBall)+ "\n");

        System.out.println("Total time spent playing sports is: "+ user3.calculateTime(running3)+ "\n");
    }
}
